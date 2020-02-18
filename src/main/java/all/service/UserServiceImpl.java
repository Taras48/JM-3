package all.service;

import all.dao.UserDaoImpl;
import all.dbHelper.DBHelper;
import all.model.User;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private static UserServiceImpl userService;

    private UserServiceImpl() {
    }

    public static UserServiceImpl getInstance() {
        if (userService == null) {
            userService = new UserServiceImpl();
        }
        return userService;
    }

    private UserDaoImpl getUserDao() {
        return new UserDaoImpl(DBHelper.getConnection());
    }

    @Override
    public void addUser(User user) {
        getUserDao().addUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        try {
            return getUserDao().getAllUsers();
        } catch (SQLException e) {
            System.out.println("error get All users");
        }
        return null;
    }

    @Override
    public void updateUser(User user) {
        getUserDao().updateUser(user);
    }

    @Override
    public boolean isUser(Long id) {
        return getUserDao().isUserExist(id);
    }

    @Override
    public boolean deleteUser(Long id) {
        return getUserDao().deleteUser(id);
    }
}

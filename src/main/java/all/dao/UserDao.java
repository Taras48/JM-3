package all.dao;

import all.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers() throws SQLException;

    boolean addUser(User user);

    boolean isUserExist(Long id);

    void updateUser(User user);

    boolean deleteUser(Long id);
}

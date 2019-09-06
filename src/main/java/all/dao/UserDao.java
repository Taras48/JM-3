package all.dao;

import all.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public List<User> getAllUsers() throws SQLException;
    public boolean addUser(User user);
    public boolean isUser(Long id);
    public void updateUser(User user);
    public boolean deleteUser(Long id);
}

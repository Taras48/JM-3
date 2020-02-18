package all.service;

import all.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getAllUsers();

    void updateUser(User user);

    boolean isUser(Long id);

    boolean deleteUser(Long id);
}

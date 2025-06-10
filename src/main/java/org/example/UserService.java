package org.example;
public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public String authenticate(String username, String password) {
        // 这里可以添加用户认证逻辑
        return userDao.findUser(username) != null ? "认证成功" : "认证失败";
    }
}

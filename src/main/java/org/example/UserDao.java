package org.example;
public class UserDao {
    public String findUser(String username) {
        // 模拟数据库查询
        return "testUser".equals(username) ? username : null;
    }
}

package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService(userDao());
    }

    @Bean
    public UserDao userDao() {
        return new UserDao();
    }
}

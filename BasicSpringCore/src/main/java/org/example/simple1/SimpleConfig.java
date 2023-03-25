package org.example.simple1;

import org.example.simple1.UserRepository;
import org.example.simple1.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConfig {

    @Bean
    public UserService userService() {
        return new UserService(userRepository());
    }
    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
}

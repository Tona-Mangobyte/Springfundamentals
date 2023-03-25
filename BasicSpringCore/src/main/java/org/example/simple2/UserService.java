package org.example.simple2;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    private UserService() {}
    public UserService(UserRepository userRepository) {}

    public void sayHello() {
        System.out.println("Hello UserService");
    }
}

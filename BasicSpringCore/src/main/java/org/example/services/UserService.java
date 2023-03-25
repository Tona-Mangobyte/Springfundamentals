package org.example.services;

import org.example.repositories.UserRepository;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public class UserService {
    private UserService() {}
    public UserService(UserRepository userRepository) {}

    public void sayHello() {
        System.out.println("Hello UserService");
    }
}

package org.example.services;

import org.example.repositories.UserRepository;

public class UserService {
    public UserService() {}
    public UserService(UserRepository userRepository) {}

    public void sayHello() {
        System.out.println("Hello UserService");
    }
}

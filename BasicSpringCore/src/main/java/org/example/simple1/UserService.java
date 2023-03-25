package org.example.simple1;

public class UserService {
    private UserService() {}
    public UserService(UserRepository userRepository) {}

    public void sayHello() {
        System.out.println("Hello UserService");
    }
}

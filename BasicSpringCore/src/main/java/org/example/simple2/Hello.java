package org.example.simple2;

import org.springframework.stereotype.Component;

@Component
public class Hello {

    public void sayHello() {
        System.out.println("Hello World");
    }

    @Override
    public String toString() {
        return "Hello class";
    }
}

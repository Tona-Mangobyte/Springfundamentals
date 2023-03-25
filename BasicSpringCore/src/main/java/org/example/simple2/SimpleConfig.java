package org.example.simple2;

import org.example.simple1.UserRepository;
import org.example.simple1.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.simple2")
public class SimpleConfig {}

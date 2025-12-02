package com.example.demo;

import com.example.demo.model.Country;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User("Alice", 25, Country.RUSSIA));
            userRepository.save(new User("Bob", 30, Country.USA));
            userRepository.save(new User("Charlie", 22, Country.GERMANY));
            userRepository.save(new User("Diana", 28, Country.JAPAN));
            userRepository.save(new User("Eva", 35, Country.BRAZIL));
        };
    }
}
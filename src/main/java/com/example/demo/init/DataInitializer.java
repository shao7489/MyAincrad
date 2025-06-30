package com.example.demo.init;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.UserData;
import com.example.demo.repository.UserRepository;


@Component
public class DataInitializer implements ApplicationRunner{
    
    private final UserRepository userRepository;

    public DataInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    

    @Override
    public void run(ApplicationArguments args) {
        try {
            if (userRepository.count() == 0) {
                userRepository.save(new UserData("Alice", "alice@example.com","123"));
                userRepository.save(new UserData("Bob", "bob@example.com","test123"));
                System.out.println("預設使用者資料已初始化");
            }
        } catch (Exception e) {
            System.err.println("初始化預設使用者資料時發生錯誤:");
            e.printStackTrace(); // 印出例外
        }
    }
}

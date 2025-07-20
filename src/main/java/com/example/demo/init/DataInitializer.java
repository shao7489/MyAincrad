package com.example.demo.init;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.CharacterData;
import com.example.demo.model.UserData;
import com.example.demo.repository.CharacterDataRepository;
import com.example.demo.repository.UserRepository;


@Component
public class DataInitializer implements ApplicationRunner{
    
    private final UserRepository userRepository;
    private final CharacterDataRepository characterDataRepository;

    public DataInitializer(UserRepository userRepository,CharacterDataRepository characterDataRepository) {
        this.userRepository = userRepository;
        this.characterDataRepository= characterDataRepository;
    }

    

    @Override
    public void run(ApplicationArguments args) {
        try {
            if (characterDataRepository.count() == 0) {
                characterDataRepository.save(new CharacterData("初心者",100,30,20,50,20,20,25,10,15,
                20,15,15,15,10,5,10,5,5));
            }

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

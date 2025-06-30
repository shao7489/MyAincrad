package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.UserData;
import com.example.demo.model.UserRequest;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    
    public List<UserData> findAll() {
        return repository.findAll();
    }
    
    public UserData save(UserData user ) {
        return repository.save(user);
    }

    public UserRequest userEmailFindUserData(String userEmail){

        UserRequest userRequest = new UserRequest();
        UserData userData = repository.findByUserEmail(userEmail)
            .orElseThrow(() -> new RuntimeException("找不到使用者 email: " +userEmail));

        userRequest.setUserName(userData.getUserName());
        userRequest.setUserEmail(userData.getUserEmail());
        userRequest.setCharacterName(userData.getCharacterName());
        userRequest.setLevel(userData.getLevel());
        userRequest.setXp(userData.getXp());
        userRequest.setHp(userData.getHp());
        userRequest.setStrValue(userData.getStrValue());
        userRequest.setDefValue(userData.getDefValue());
        userRequest.setStaValue(userData.getStaValue());
        userRequest.setDexValue(userData.getDexValue());
        userRequest.setSpdValue(userData.getSpdValue());
        userRequest.setTacValue(userData.getTacValue());
        userRequest.setIntValue(userData.getIntValue());
        userRequest.setLckValue(userData.getLckValue());


        return userRequest;
    }



    public String userLogin(String userEmail,String userPassword){
        try {
            UserData userData = repository.findByUserEmail(userEmail).get();

            if (userData.getUserPassword().equals(userPassword)){
                return "true";
            }
            return "false";

        } catch (Exception e) {
            // TODO: handle exception
            return "signup"; //無帳號轉註冊
        }

    }

    public String userEmailFindName(String userEmail){
        return repository.findByUserEmail(userEmail).get().getUserName();
    }
    
    
}

package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoginUser;
import com.example.demo.model.SigupUser;
import com.example.demo.model.UserData;
import com.example.demo.model.UserRequest;
import com.example.demo.service.UserService;



@RestController
@RequestMapping("api/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserData> getUsers() {
        return userService.findAll();
    }

    @PostMapping("emailGetUser")
    public UserRequest getUser(@RequestBody Map<String, String> email){
        return userService.userEmailFindUserData(email.get("email"));
    }


    @PostMapping("signup")
    public UserData createUser(@RequestBody SigupUser sigupUser) {
        UserData newUserData = new UserData(sigupUser.getName(),sigupUser.getEmail(),sigupUser.getPassword());
        return userService.save(newUserData);
    }

    @PostMapping("login")
    public ResponseEntity<Map<String, String>> userLogin(@RequestBody LoginUser loginUser){

        Map<String, String> result = new HashMap<>();

        String testLogin =  userService.userLogin(loginUser.getUserEmail(), loginUser.getUserPassword());
        if (testLogin=="true"){
            result.put("status", "true");
            result.put("userEmail", loginUser.getUserEmail());
            return ResponseEntity.ok(result);
        }else if (testLogin == "signup"){
            result.put("status", "signup");
            return ResponseEntity.ok(result);
        }else{
            result.put("status", "false");
            return ResponseEntity.ok(result);
        }
    }


}

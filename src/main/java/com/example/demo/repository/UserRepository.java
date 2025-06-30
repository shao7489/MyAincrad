package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.UserData;


public interface UserRepository extends JpaRepository<UserData,Integer> {

    Optional<UserData> findByUserEmail(String userEmail);

    
} 
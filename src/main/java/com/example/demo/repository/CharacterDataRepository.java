package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.example.demo.model.CharacterData;



public interface CharacterDataRepository extends JpaRepository<CharacterData,Integer>{
    
    Optional<CharacterData> findByCharacterName(String characterName);

}

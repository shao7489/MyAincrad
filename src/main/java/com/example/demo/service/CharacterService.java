package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CharacterData;
import com.example.demo.repository.CharacterDataRepository;

@Service
public class CharacterService {

    @Autowired
    private CharacterDataRepository characterDataRepository;


    
    public CharacterData characterNameFindCharacterData(String characterName){
        return this.characterDataRepository.findByCharacterName(characterName).get();
    }
    
}

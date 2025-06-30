package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String userEmail;
    private String userPassword;
    private Integer characterId;
    private String characterName;
    private Integer level;
    private Integer xp;
    private Integer hp;
    private Integer strValue;  //力量
    private Integer defValue;  //防禦
    private Integer staValue;  //體力
    private Integer dexValue;  //敏捷
    private Integer spdValue;  //反應速度
    private Integer tacValue;  //技巧
    private Integer intValue;  //智力
    private Integer lckValue;  //幸運





    public UserData(){}
    
    public UserData(String userName,String userEamil,String userPassword){
        this.setUserName(userName);
        this.setUserEmail(userEamil);
        this.setUserPassword(userPassword);
        this.setCharacterId(this.id);
        this.defaultCharact();

    }

    


    public void defaultCharact(){
        this.setCharacterName("初心者");
        this.setLevel(1);
        this.setXp(0);
        this.setHp(100);
        this.setStrValue(30);
        this.setDefValue(20);
        this.setStaValue(50);
        this.setDexValue(20);
        this.setSpdValue(20);
        this.setTacValue(25);
        this.setIntValue(10);
        this.setLckValue(15);
    }




    // Getters and Setters 
    public Integer getId(){return id; }
    public void setId(Integer id) {this.id = id; }


    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}


    public String getUserEmail() {return userEmail;}
    public void setUserEmail(String userEmail) {this.userEmail = userEmail;}


    public String getUserPassword() {return userPassword;}
    public void setUserPassword(String userPassword) {this.userPassword = userPassword;}


    public Integer getCharacterId() {return characterId;}
    public void setCharacterId(Integer characterId) {this.characterId = characterId;}


    public String getCharacterName() {return characterName;}
    public void setCharacterName(String characterName) {this.characterName = characterName;}


    public Integer getLevel() {return level;}
    public void setLevel(Integer level) {this.level = level;}


    public Integer getXp() {return xp;}
    public void setXp(Integer xp) {this.xp = xp;}


    public Integer getHp() {return hp;}
    public void setHp(Integer hp) {this.hp = hp;}


    public Integer getStrValue() {return strValue;}
    public void setStrValue(Integer strValue) {this.strValue = strValue;}


    public Integer getDefValue() {return defValue;}
    public void setDefValue(Integer defValue) {this.defValue = defValue;}


    public Integer getStaValue() {return staValue;}
    public void setStaValue(Integer staValue) {this.staValue = staValue;}


    public Integer getDexValue() {return dexValue;}
    public void setDexValue(Integer dexValue) {this.dexValue = dexValue;}


    public Integer getSpdValue() {return spdValue;}
    public void setSpdValue(Integer spdValue) {this.spdValue = spdValue;}


    public Integer getTacValue() {return tacValue;}
    public void setTacValue(Integer tacValue) {this.tacValue = tacValue;}


    public Integer getIntValue() {return intValue;}
    public void setIntValue(Integer intValue) {this.intValue = intValue;}


    public Integer getLckValue() {return lckValue;}
    public void setLckValue(Integer lckValue) {this.lckValue = lckValue;}
    

    
}

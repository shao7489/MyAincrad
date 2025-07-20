package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class CharacterData {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer characterid;
    private String  characterName;

    private Integer hp;
    private Integer strValue;  //力量
    private Integer defValue;  //防禦
    private Integer staValue;  //體力
    private Integer dexValue;  //敏捷
    private Integer spdValue;  //反應速度
    private Integer tacValue;  //技巧
    private Integer intValue;  //智力
    private Integer lckValue;  //幸運
    
    private Integer hpChange;
    private Integer strChange;  //力量
    private Integer defChange;  //防禦
    private Integer staChange;  //體力
    private Integer dexChange;  //敏捷
    private Integer spdChange;  //反應速度
    private Integer tacChange;  //技巧
    private Integer intChange;  //智力
    private Integer lckChange;  //幸運


    public CharacterData(){}

    public CharacterData(String characterName,Integer hp,Integer strValue,Integer defValue,Integer staValue,Integer dexValue,Integer spdValue,Integer tacValue,Integer intValue,Integer lckValue,
    Integer hpChange,Integer strChange,Integer defChange,Integer staChange,Integer dexChange,Integer spdChange,Integer tacChange,Integer intChange,Integer lckChange){
        this.setCharacterName(characterName);

        this.setHp(hp);
        this.setStrValue(strValue);
        this.setDefValue(defValue);
        this.setStaValue(staValue);
        this.setDexValue(dexValue);
        this.setSpdValue(spdValue);
        this.setTacValue(tacValue);
        this.setIntValue(intValue);
        this.setLckValue(lckValue);

        this.setHpChange(hpChange);
        this.setStrChange(strChange);
        this.setDefChange(defChange);
        this.setStaChange(staChange);
        this.setDexChange(dexChange);
        this.setSpdChange(spdChange);
        this.setTacChange(tacChange);
        this.setIntChange(intChange);
        this.setLckChange(lckChange);
    }




    // Getters and Setters 
    public String getCharacterName() {return characterName;}
    public void setCharacterName(String characterName) {this.characterName = characterName;}
    
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


    public Integer getHpChange() {return hpChange;}
    public void setHpChange(Integer hpChange) {this.hpChange = hpChange;}
    
    public Integer getStrChange() {return strChange;}
    public void setStrChange(Integer strChange) {this.strChange = strChange;}

    public Integer getDefChange() {return defChange;}
    public void setDefChange(Integer defChange) {this.defChange = defChange;}

    public Integer getStaChange() {return staChange;}
    public void setStaChange(Integer staChange) {this.staChange = staChange;}

    public Integer getDexChange() {return dexChange;}
    public void setDexChange(Integer dexChange) {this.dexChange = dexChange;}

    public Integer getSpdChange() {return spdChange;}
    public void setSpdChange(Integer spdChange) {this.spdChange = spdChange;}

    public Integer getTacChange() {return tacChange;}
    public void setTacChange(Integer tacChange) {this.tacChange = tacChange;}

    public Integer getIntChange() {return intChange;}
    public void setIntChange(Integer intChange) {this.intChange = intChange;}

    public Integer getLckChange() {return lckChange;}
    public void setLckChange(Integer lckChange) {this.lckChange = lckChange;}



}

package com.example.demo.model;

public class UserRequest {
    private String userName;
    private String userEmail;
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



    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}

    public String getUserEmail() {return userEmail;}
    public void setUserEmail(String userEmail) {this.userEmail = userEmail;}

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

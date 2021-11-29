package com.graham;

public class Attributes {

    private int vitality;
    private int strength;
    private int endurance;
    private int dexterity;
    private int speed;

    public Attributes() {
        this.vitality = 2;
        this.strength = 2;
        this.endurance = 2;
        this.dexterity = 2;
        this.speed = 2;
    }

    public Attributes(int vitality, int strength, int endurance, int dexterity,
                      int speed) {
        this.vitality = vitality;
        this.strength = strength;
        this.endurance = endurance;
        this.dexterity = dexterity;
        this.speed = speed;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

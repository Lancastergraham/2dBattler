package com.graham;

public class CharacterSheet {

    private String name;
    private int level;
    private CharacterClasses characterClass;
    private int experiencePoints;
    private Attributes attributes;

    public CharacterSheet() {
        this.name = "Donovan";
        this.level = 1;
        this.characterClass = CharacterClasses.SOLDIER;
        this.experiencePoints = 0;
        this.attributes = new Attributes();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = "...";
        } else {
            this.name = name;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {
        this.level++;
    }

    public String getCharacterClass() {
        return characterClass.getClassName();
    }

    public void setCharacterClass(CharacterClasses characterClass) {
        this.characterClass = characterClass;
    }

    public int getExperience() {
        return experiencePoints;
    }

    public void setExperience(int experience) {
        this.experiencePoints += experience;
    }

    public void killExperience(int experience) {
        this.setExperience(experience);

        while(shouldLevel()) {
            this.levelUp();
        }

    }

    private boolean shouldLevel() {
        int currentExp = this.experiencePoints;
        int currentLevel = this.level;

        double nextLevelExp = (Math.pow(2, currentLevel - 1)) * 250;

        return currentExp >= nextLevelExp;

    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public void setStats(int vitality, int strength, int endurance,
                         int dexterity,
                         int speed) {

        Attributes setAttributePoints = new Attributes(vitality,
                strength, endurance, dexterity, speed);

        this.setAttributes(setAttributePoints);
    }

    public int getHitPoints() {
        return this.attributes.getVitality() + this.characterClass.getBaseHp();
    }
}

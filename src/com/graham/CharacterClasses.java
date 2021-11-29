package com.graham;

public enum CharacterClasses {
    SOLDIER ("Soldier", 20, 5, 3, 4),
    MONK ("Monk", 15, 5, 2, 3),
    BOXER ("Boxer", 15, 7, 3, 5);

    private String className;
    private int baseHp;
    private int baseDamage;
    private int baseDefense;
    private int baseSpeed;

    CharacterClasses(String className, int baseHp, int baseDamage,
                     int baseDefense, int baseSpeed) {
        this.className = className;
        this.baseHp = baseHp;
        this.baseDamage = baseDamage;
        this.baseDefense = baseDefense;
        this.baseSpeed = baseSpeed;
    }

    public String getClassName() {
        return className;
    }

    public int getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(int baseHp) {
        this.baseHp = baseHp;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }
}

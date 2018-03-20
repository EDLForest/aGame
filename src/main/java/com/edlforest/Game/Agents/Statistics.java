package com.edlforest.Game.Agents;

public class Statistics {
    private int Strength;
    private int Constitution;
    private int Agility;
    private int Intelligence;
    private int Wisdom;

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getConstitution() {
        return Constitution;
    }

    public void setConstitution(int constitution) {
        Constitution = constitution;
    }

    public int getAgility() {
        return Agility;
    }

    public void setAgility(int agility) {
        Agility = agility;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public void setWisdom(int wisdom) {
        Wisdom = wisdom;
    }

    @Override
    public String toString() {
        return "Statistics {" +
                "Strength=" + Strength +
                ", Constitution=" + Constitution +
                ", Agility=" + Agility +
                ", Intelligence=" + Intelligence +
                ", Wisdom=" + Wisdom +
                '}';
    }
}

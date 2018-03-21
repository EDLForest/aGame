package com.edlforest.Game.Agents;


import java.util.ArrayList;
import java.util.List;

public class MoveSet {

    private ArrayList<Ability> abilities;

    public MoveSet(){
        abilities = new ArrayList<>();
    }

    public MoveSet(Ability ability){
        abilities = new ArrayList<Ability>();
        abilities.add(ability);
    }

    public MoveSet(List<Ability> abilities) {
        this.abilities = new ArrayList<Ability>(abilities);
    }

    public void addAbilities(Ability ability){
        abilities.add(ability);
    }

    public ArrayList<Ability> getAbilities(){
        return abilities;
    }

    @Override
    public String toString() {
        return "MoveSet{" +
                "abilities=" + abilities +
                '}';
    }
}

package main.java.Agents.Abilities;

public abstract class Ability {

    private String name;
    private int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

}

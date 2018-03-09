package main.java.Agents;

public abstract class Agent {
    enum attribute {
        NORMAL, WIND, FIRE, WATER,
        EARTH, ELECTRIC, LIGHT, DARK
    }

    private attribute attribute;
    private String name;
    private Statistics stats;
    private MoveSet moveSet;

    public Agent.attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Agent.attribute attribute) {
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Statistics getStats() {
        return stats;
    }

    public void setStats(Statistics stats) {
        this.stats = stats;
    }

    public MoveSet getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(MoveSet moveSet) {
        this.moveSet = moveSet;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "attribute=" + attribute +
                ", name='" + name + '\'' +
                ", stats=" + stats +
                ", moveSet=" + moveSet +
                '}';
    }
}

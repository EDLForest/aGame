package com.edlforest.Game.Agents;

/**
 * An Agent is an entity that is capable of making various choices and actions
 * during the game play. Agent can be controlled by a human player or an AI.
 * Every agent, is capable, will be prompted to make actions during a game loop.
 * The Action made by an Agent can affect and change the state of the game.
 * If the Agent is a player-controller character, it will be equipped with
 * an InputHandler, which will serve as the interface between the human player
 * and the agent. When queried for action, the InputHandler will obtain the input
 * from the payer.
 * If the agent is computer controlled, then it's action will be controlled by AI.
 */
public abstract class Agent {

    enum attribute {
        NORMAL, WIND, FIRE, WATER,
        EARTH, ELECTRIC, LIGHT, DARK
    }

    private attribute attribute;
    private String name;
    private Statistics stats;
    private MoveSet moveSet;
    private boolean isPlayer;

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

    public boolean isPlayer() {
        return isPlayer;
    }

    public void setPlayer(boolean player) {
        isPlayer = player;
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

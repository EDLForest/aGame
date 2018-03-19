package main.java.Managers;

import main.java.Agents.Action;
import main.java.Agents.Agent;

import java.util.ArrayList;
import java.util.List;

public class BattleManager extends Manager{

    ArrayList<Agent> agents;
    int current;


    /**
     * initialize a battle manager, which controls the battle game sequences.
     * The battle manager manages the flow of the turn based battle system.
     * Each manager should have a Thread in which they manages
     *
     * @param agents, an ArrrayList of Agents
     */
    public BattleManager (ArrayList<Agent> agents){
        this.agents = agents;
        current = 0;
    }

    /**
     * Update the state of the game, including Agents' stats,
     * environment, etc.
     *
     * Also since the ArrayList of the agent
     * is ordered in their speed stat(for now), if the speed
     * of the agents changes, we should also reflect this change
     * onto the order of the Agent in the next round. So for now
     * When a round of action has concluded, re-sort the ArrayList
     * to correctly reflect the
     */
    @Override
    public void update(Action nextAction) {
        System.out.println(nextAction);     //use toString() to display the Action to players
        nextAction.execute();


    }

    /**
     * "Display" the current updated game state to the User Interface
     */
    @Override
    public void display() {

    }
}

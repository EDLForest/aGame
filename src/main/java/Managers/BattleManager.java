package main.java.Managers;

import main.java.Agents.Action;
import main.java.Agents.Agent;

import java.util.ArrayList;
import java.util.List;

public class BattleManager implements Manager{

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
     * Obtain the next action from the current Agent playing
     * If the agent is a player, query action from the player
     * If the agent is a NPC, use an AI to decide its action
     * @return Action of the Current Agent
     */
    @Override
    public Action getNextAction() {

//        current = (current++)%agents.size(); //Index
        return null;
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
    public void update() {


//        if(current == 0)
//            resort the Agent ArrayList
    }

    /**
     * "Display" the current updated game state to the User Interface
     */
    @Override
    public void display() {

    }
}

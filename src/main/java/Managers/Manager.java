package main.java.Managers;

import main.java.Agents.Action;
import main.java.Agents.Agent;
import main.java.Agents.InputHandler;

import java.util.*;

/**
 * This is a Manager class whose job is to manage the control flow of the game.
 * for example the battle manager shall manage the flow the battle, since this
 * game will be designed as a turn based game, we need to have a control flow.
 * the main game loop should also have a manager for control flow.
 * Think of the manager as the finite state diagram of a controller.
 *
 * Every manager should have a Thread in which they manages. OR
 * Every game loop thread shall be instantiated with an appropriate manager.
 *
 * The game loop handles three important tasks:
 *      -Get user Input
 *      -Update game state
 *          -For battle manager, updating game state including changing player hp,
 *              mp, and other status
 *          -For main manager, updating game state would be like updating agent position,
 *              update menu of interaction.
 *          -Currently only plan to have these two manager, will add on more managers for
 *              different gui and modules such as shop, status and inventories.
 *
 *      -Draw/display game state to the gui
 *
 * The manager needs to manage numbers of agents, who performs actions and affect the
 * state of the game. If there are no agent in the game, then the game will not advance.
 * the manager should have a List of agents and actively checks for lack of player-agents.
 */
public abstract class Manager {

    //An arrayList of agents, whose action will affect the state of the game
    ArrayList<Agent> agents;
    Iterator<Agent> agentIterator;

    InputHandler inputHandler;

    public Manager(){
        agents = new ArrayList<>();
        agentIterator = agents.iterator();
        inputHandler = InputHandler.getBattleInputHandler();
    }

    //Use Iterator to cycle through the List of agents and query their next action
    public Action getNextAction(){
        Action nextAction;

        if(agents.isEmpty()) {
            System.out.println("ERROR: No Player-Agents in the game");
            System.exit(1);
            return null;
        }

        Agent current = agentIterator.next();
        System.out.println("Current agent is: " + current.getName() + ".");
        if (current.isPlayer())
            nextAction = inputHandler.getUserAction();
        else
            //If the agent is not a player, get an AI action
            nextAction = null;
        return nextAction;

    }
    abstract void update();
    abstract void display();


}

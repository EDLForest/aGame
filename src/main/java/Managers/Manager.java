package main.java.Managers;

import main.java.Agents.Action;
import main.java.Agents.Agent;

import java.util.List;

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
 *      -Draw/display game
 *
 * The manager needs to manage numbers of agents, who performs actions and affect the
 * state of the game. If there are no agent in the game, then the game will not advance.
 * the manager should have a List of agents and actively checks for lack of player-agents.
 */
public interface Manager {

    public Action getNextAction();
    public void update();
    public void display();

}

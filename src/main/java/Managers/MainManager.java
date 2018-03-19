package main.java.Managers;

import main.java.Agents.Action;
import main.java.Agents.Agent;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * The main manager shall manage the overall game progress on the main game loop.
 * The main game loop is the game loop in which the player explores the world and
 * interacts with NPCs and potentially other players. In this game loop,
 * the player-agent are expected to interact with other Agents and progress the game.
 * The player-agent's interaction with other agents and objects will be managed by
 * the corresponding manager. For example when player-agent is engaged into a battle,
 * a battle loop thread will be spawned and this thread will be managed by a
 * battle manager. The main game loop shall be halted until the battle loop resolves
 * Essentially, the function of the main game loop is to trigger other game loops.
 *
 */
public class MainManager extends Manager{


    public Action getNextAction() {

        return null;
    }

    @Override
    public void update() {

    }

    @Override
    public void display() {

    }
}

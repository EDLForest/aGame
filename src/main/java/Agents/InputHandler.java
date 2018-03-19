package main.java.Agents;


import javafx.scene.layout.Background;
import main.java.Managers.BattleManager;

import java.util.Scanner;

/**
 * InputHandler is responsible for obtaining the raw input from the player
 * and then translate these raw input, such as numbered choices, arrow keys, etc.
 * into Actions understandable by the program, such as Attack, Run, Item, etc.
 * What the InputHandler needs to do is:
 *      -Wait fot getAction request from Manager
 *      -Prompt the player
 *      -Listen to the player
 *      -Translate the player raw input into an Action
 *      -return the translated Action
 *
 * InputHandler will be equipped onto the manager classes. InputHandler does not know which
 * Agent that the action will be affecting, nor does it know who is performing the action.
 * All it does is the things mentioned above.
 *
 *
 * For now, the InputHandler will be interfacing with the Standard System input
 * for the player input. But in the future, when there can be multiple party involved
 * in the game, we will need to interface the InputHandler to possibly network sockets
 * which linked to different players.
 *
 * Need to tackle the problem of prompting the user. and how to interpret the input from player
 * under different situation. For example, during battle loop, the arrow key works differently
 * from the arrow key under the main loop.
 *
 * Current solution: interpret the user input with different kinds of InputHandler
 */

public abstract class InputHandler {

    protected static Scanner userIn;

    protected InputHandler(){
        userIn = new Scanner(System.in);
    }

    public static InputHandler getBattleInputHandler() {
        return new BattleInputHandler();
    }

    public abstract Action getUserAction();
}

class BattleInputHandler extends InputHandler{

    public BattleInputHandler() {
        super();
    }

    @Override
    public Action getUserAction() {
        return null;
    }
}

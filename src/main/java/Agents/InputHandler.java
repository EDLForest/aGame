package main.java.Agents;


import main.java.Agents.Abilities.Action;

import java.util.Scanner;

/**
 * InputHandler is responsible for obtaining the raw input from the player
 * and then translate these raw input, such as numbered choices, arrow keys, etc.
 * into Abilities understandable by the program, such as Attack, Run, Item, etc.
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
 * InputHandler Will be taking in inputs from gui buttons.
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
        System.out.println("1. Attack");
        System.out.println("2. Defense");
        System.out.println("3. Items");
        System.out.println("4. Run");

        return null;
    }
}

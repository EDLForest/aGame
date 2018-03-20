package com.edlforest.Game.Agents;


/**
 * An agent makes actions during the game by inputting through certain human
 * interface devices, such as keyboard, mouse, touch pad, etc.
 * An agent, if controlled by a player (player-agent), shall have some ways of obtaining
 * input from the player. So Each player-agent shall have a way of querying input from the
 * player via an InputHandler, which will prompt, obtain, interpret, and return the
 * raw keyboard, mouse, touch-pad input from the player as an Action object
 *
 * The Action object should follow the following structure:
 *      -Action shall have an invoker field, indicating which player invoked it
 *      -Action shall have a receiver field, indicating which Agent(s) this Action
 *          is directed toward.
 *      -Action shall implement an execute method, which performs the command
 *          attached to this Action
 *
 *      eg: The player is prompted with 4 choices: attack, defend, item, and run
 *              selected by number. If the player selected 1, which is attack,
 *              the player will be prompted to indicate the receiver of this attack
 *              the exec function of this attack will reduce the hp of the receiver.
 */

public abstract class Action {

    public abstract void execute();
}

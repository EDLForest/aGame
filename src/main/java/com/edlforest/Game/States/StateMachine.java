package com.edlforest.Game.States;


/**
 * A StateMachine is the center of the control flow module of almost every part of this game.
 * A StateMachine have a Generic state variable, which holds the current state of the state machine
 * The current state of the state machine determines the behavior of the state machine.
 * The StateMachine serve as a container, wrapper for the states, because each individual state
 * are responsible for handling user input and based on that input, determine the next state of the StateMachine
 * Each concrete StateMachine must have a generic restriction of what type of state that this StateMachine
 * contain for organization purpose and as well as preventing the accident of mixing states into
 * te StateMachine that they do not belong to.
 *
 * When in operation. The StateMachine will first invoke the expressState method of its current state,
 * which will produce outputs, or produce any results that will affect the Game State By Game State, I mean
 * the state of the game not in the sense of just a State object, but rather the information
 * within the game, such as player HP and status.
 */

public abstract class StateMachine<StateType extends State> {
    private StateType state;


    void expressState(){
        state.onEnter();
    }
    abstract void handleInput();
}

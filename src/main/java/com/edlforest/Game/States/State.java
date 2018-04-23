package com.edlforest.Game.States;

/**
 * In a finite state machine, every state have its own output/behavior.
 * And know which state it should transition to next based on the input
 * of the user, the state of other objects in the game, and/or certain
 * criteria. Any state should have a reference to the StateMachine that
 * the State belongs to and with this reference, each state should be able
 * to modify the nextState of the state machine.
 *
 * When in operation, the handleUserInput method will handle the user's input
 * and determine which state the StateMachine should turn to next, then set the
 * nextState of the StateMachine accordingly.
 */
public interface State {

    void handleInput(StateMachine stateMachine);
    void onEnter();

    //Tentative method, inspired by mealy style FSM, where output can be
    //placed onto the transition between states instead on a certain state
    void onLeave();
}

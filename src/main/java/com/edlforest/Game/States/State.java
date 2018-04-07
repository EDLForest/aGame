package com.edlforest.Game.States;

/**
 * In a finite state machine, every state have its own output or behavior.
 * And know which state it should transition to next based on the input
 * of the user, the state of other objects in the game, and/or certain
 * criteria. The State Interface have a getNextState, which will determine
 * and return the next state that the current state will transition to.
 * Every state should have a nextState variable, which stores the nextState
 * that the current state would transition to next. The transition
 * The State should also be responsible for expressing the behavior of
 * the state itself.
 *      eg. A specific menuState should print specific menu options to the user
 *          A specific behaviorState should influence the Agent's behavior
 *              Such as aggressiveness, Statistics, and/or ability.
 *
 * TODO: The State interface also should be able to obtain user inputs(?)
 * Or should a manager of the state or a context of the state handle
 * the inputs and then pass it into the state?
 */
public abstract class State {

    protected State nextState;

    public State getNextState() {
        return nextState;
    }

    abstract void setNextState();
    abstract void expressState();
}

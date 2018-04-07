package com.edlforest.Game.States;

import java.util.Scanner;

public abstract class BattleMenuState extends State {
    public static BattleMenuState GET_BASEMENU(){
        return new BattleBaseMenuState();
    }
    public static BattleMenuState GET_ABILITYMENU(){
        return new BattleBaseMenuState();
    }
    static BattleMenuState GET_ITEMMENU(){
        return new BattleBaseMenuState();
    }
    public static BattleMenuState GET_RUN(){
        return new BattleBaseMenuState();
    }
}

class BattleBaseMenuState extends BattleMenuState {

    @Override
    void setNextState() {
        Scanner userIn = new Scanner(System.in);
        switch (userIn.next()) {
            case "1":
                System.out.println("Option One");
                nextState = BattleMenuState.GET_ABILITYMENU();
                break;
            case "2":
                System.out.println("Option two");
                nextState = BattleMenuState.GET_ITEMMENU();
                break;
            case "3":
                System.out.println("Option three");
                nextState = BattleMenuState.GET_RUN();
                break;
            default:
                System.out.println("Invalid Option");
                nextState = this;
        }
    }

    @Override
    void expressState() {
        System.out.println("This is the root battle menu");
    }
}

class BattleAbilityMenuState extends BattleMenuState{
    @Override
    void setNextState() {
        Scanner userIn = new Scanner(System.in);
        switch (userIn.next()) {
            case "1":
                System.out.println("Option One");
                break;
            case "2":
                System.out.println("Option two");
                break;
            case "3":
                System.out.println("Option three");
                break;
            default:
                System.out.println("Invalid Option");
                nextState = this;
        }
    }

    @Override
    void expressState() {
        System.out.println("This is the Ability Menu State");
    }
}
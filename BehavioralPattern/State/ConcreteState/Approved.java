package DesignPatterns.BehavioralPattern.State.ConcreteState;

import DesignPatterns.BehavioralPattern.State.State.State;

public class Approved implements State {

    @Override
    public void handle() {
        System.out.println("Approved Document");
    }
    
}
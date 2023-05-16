package DesignPatterns.BehavioralPattern.State.ConcreteState;

import DesignPatterns.BehavioralPattern.State.State.State;

public class Rejected implements State {

    @Override
    public void handle() {
        System.out.println("Rejected Document");
    }
    
}
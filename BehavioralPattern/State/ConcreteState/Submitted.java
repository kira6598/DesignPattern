package DesignPatterns.BehavioralPattern.State.ConcreteState;

import DesignPatterns.BehavioralPattern.State.State.State;

public class Submitted implements State {

    @Override
    public void handle() {
        System.out.println("Submitted Document");
    }
    
}
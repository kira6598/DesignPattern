package DesignPatterns.BehavioralPattern.State.ConcreteState;

import DesignPatterns.BehavioralPattern.State.State.State;

public class New implements State {

    @Override
    public void handle() {
        System.out.println("create new Document");
    }
    
}

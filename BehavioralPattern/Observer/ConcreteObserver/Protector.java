package DesignPatterns.BehavioralPattern.Observer.ConcreteObserver;

import DesignPatterns.BehavioralPattern.Observer.User.Login_Status;
import DesignPatterns.BehavioralPattern.Observer.User.User;
import DesignPatterns.BehavioralPattern.Observer.observer.Observer;

public class Protector implements Observer {

    @Override
    public void update(User user) {
        if(user.getStatus()==Login_Status.INVALID){
            System.out.println("Protector: User " + user.getEmail() + " is invalid. "
            + "IP " + user.getIp() + " is blocked");
        }
    }
    
}
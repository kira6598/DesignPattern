package DesignPatterns.BehavioralPattern.Observer.ConcreteObserver;

import DesignPatterns.BehavioralPattern.Observer.User.User;
import DesignPatterns.BehavioralPattern.Observer.observer.Observer;

public class Logger implements Observer {

    @Override
    public void update(User user) {
        System.out.println("Logger "+user+" Login "+user.getStatus());
    }
    
}

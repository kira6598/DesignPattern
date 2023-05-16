package DesignPatterns.BehavioralPattern.Observer.ConcreteObserver;

import DesignPatterns.BehavioralPattern.Observer.User.Login_Status;
import DesignPatterns.BehavioralPattern.Observer.User.User;
import DesignPatterns.BehavioralPattern.Observer.observer.Observer;

public class Mailer implements Observer {

    @Override
    public void update(User user) {
        if(user.getStatus()==Login_Status.EXPIRED){
            System.out.println("Mailer: User " + user.getEmail()+" is expired. An email was sent!");
    }
    
}}

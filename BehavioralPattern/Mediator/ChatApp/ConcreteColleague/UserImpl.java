package DesignPatterns.BehavioralPattern.Mediator.ChatApp.ConcreteColleague;

import DesignPatterns.BehavioralPattern.Mediator.ChatApp.Colleague.User;
import DesignPatterns.BehavioralPattern.Mediator.ChatApp.Mediator.ChatMediator;

public class UserImpl extends User {

    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
 
    }

    @Override
    public void send(String msg) {
        System.out.println("---");
        System.out.println(this.name + " is sending the message: " + msg);
        chatMediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " received the message: " + msg);

    }
    
}

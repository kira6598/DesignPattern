package DesignPatterns.BehavioralPattern.Mediator.ChatApp;

import DesignPatterns.BehavioralPattern.Mediator.ChatApp.Colleague.User;
import DesignPatterns.BehavioralPattern.Mediator.ChatApp.ConcreteColleague.UserImpl;
import DesignPatterns.BehavioralPattern.Mediator.ChatApp.ConcreteMediator.ChatMediatorImpl;
import DesignPatterns.BehavioralPattern.Mediator.ChatApp.Mediator.ChatMediator;

public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl("Java design pattern ");
         
        User admin = new UserImpl(mediator, "GP Coder");
        User user1 = new UserImpl(mediator, "User 1");
        User user2 = new UserImpl(mediator, "User 2");
        User user3 = new UserImpl(mediator, "User 3");
         
        mediator.addUser(admin);
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        admin.send("Hi All");
        user1.send("Hi Admin");
    }
}

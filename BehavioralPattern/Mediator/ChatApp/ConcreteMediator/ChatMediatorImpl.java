package DesignPatterns.BehavioralPattern.Mediator.ChatApp.ConcreteMediator;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns.BehavioralPattern.Mediator.ChatApp.Colleague.User;
import DesignPatterns.BehavioralPattern.Mediator.ChatApp.Mediator.ChatMediator;

public class ChatMediatorImpl implements ChatMediator {

    public ChatMediatorImpl(String grName){
        System.out.println(grName+"group is created!");
    }

    private List<User> users = new ArrayList<>();
    @Override
    public void sendMessage(String msg, User user) {
       for (User user1 : users) {
            if(!user1.equals(user)){
                user1.receive(msg);
            };
       }
    }

    @Override
    public void addUser(User user) {
        System.out.println(user.name + " joined this group");
        this.users.add(user);
    }
    
}

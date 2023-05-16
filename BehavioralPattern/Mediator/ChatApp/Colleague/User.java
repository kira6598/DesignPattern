package DesignPatterns.BehavioralPattern.Mediator.ChatApp.Colleague;

import DesignPatterns.BehavioralPattern.Mediator.ChatApp.Mediator.ChatMediator;

public abstract class User {
    public ChatMediator chatMediator;
    public  String name;
    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }
    public abstract void send(String msg);
    public abstract void receive(String msg);

    @Override
    public int hashCode(){
        return name.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(obj instanceof User){
            User user = (User) obj;
            return name.equals(user.name);
        }
        return false;
    }
}

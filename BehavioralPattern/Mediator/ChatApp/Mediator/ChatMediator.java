package DesignPatterns.BehavioralPattern.Mediator.ChatApp.Mediator;

import DesignPatterns.BehavioralPattern.Mediator.ChatApp.Colleague.User;

public interface ChatMediator {
    void sendMessage(String msg,User user);
    void addUser(User user);
}

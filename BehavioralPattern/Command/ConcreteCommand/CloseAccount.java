package DesignPatterns.BehavioralPattern.Command.ConcreteCommand;

import DesignPatterns.BehavioralPattern.Command.Command.Command;
import DesignPatterns.BehavioralPattern.Command.Receiver.Account;

public class CloseAccount implements Command {
    private Account account;


    public CloseAccount(Account account) {
        this.account = account;
    }


    @Override
    public void executed() {
       account.open();
    }
    
}
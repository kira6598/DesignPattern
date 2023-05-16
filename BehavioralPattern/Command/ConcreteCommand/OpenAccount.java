package DesignPatterns.BehavioralPattern.Command.ConcreteCommand;

import DesignPatterns.BehavioralPattern.Command.Command.Command;
import DesignPatterns.BehavioralPattern.Command.Receiver.Account;

public class OpenAccount implements Command {
    private Account account;

    public OpenAccount(Account account) {
        this.account = account;
    }


    @Override
    public void executed() {
       account.open();
    }
    
}

package DesignPatterns.BehavioralPattern.Command.Client;

import DesignPatterns.BehavioralPattern.Command.Command.Command;
import DesignPatterns.BehavioralPattern.Command.ConcreteCommand.CloseAccount;
import DesignPatterns.BehavioralPattern.Command.ConcreteCommand.OpenAccount;
import DesignPatterns.BehavioralPattern.Command.Invoke.BankApp;
import DesignPatterns.BehavioralPattern.Command.Receiver.Account;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("gpcoder");
 
        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);
 
        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
    }
}

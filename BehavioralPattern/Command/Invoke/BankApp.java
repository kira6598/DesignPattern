package DesignPatterns.BehavioralPattern.Command.Invoke;

import DesignPatterns.BehavioralPattern.Command.Command.Command;

public class BankApp {
    Command OpenAccount;
    Command CloseAccount;
    public BankApp(Command openAccount, Command closeAccount) {
        OpenAccount = openAccount;
        CloseAccount = closeAccount;
    }

    public void clickOpenAccount() {
        System.out.println("User click open an account");
        OpenAccount.executed();
    }
 
    public void clickCloseAccount() {
        System.out.println("User click close an account");
        CloseAccount.executed();
    }
    
}

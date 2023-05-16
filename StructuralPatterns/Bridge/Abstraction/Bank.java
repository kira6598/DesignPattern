package DesignPatterns.StructuralPatterns.Bridge.Abstraction;

import DesignPatterns.StructuralPatterns.Bridge.Implementor.Account;

public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }
    public abstract void OpenAccount();

}

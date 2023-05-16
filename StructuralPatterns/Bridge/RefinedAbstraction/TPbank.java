package DesignPatterns.StructuralPatterns.Bridge.RefinedAbstraction;

import DesignPatterns.StructuralPatterns.Bridge.Abstraction.Bank;
import DesignPatterns.StructuralPatterns.Bridge.Implementor.Account;

public class TPbank extends Bank {

    public TPbank(Account account) {
        super(account);
    }

    @Override
    public void OpenAccount() {
      System.out.println("Open your account at VietcomBank is a ");
      account.OpenAccount();
    }
    
}
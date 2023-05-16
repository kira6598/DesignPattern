package DesignPatterns.StructuralPatterns.Bridge.ConcreateImplementor;

import DesignPatterns.StructuralPatterns.Bridge.Implementor.Account;

public class CheckingAccout implements Account {

    @Override
    public void OpenAccount() {
        System.out.println("Checking Account");
    }
    
}

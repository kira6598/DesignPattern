package DesignPatterns.StructuralPatterns.Bridge.ConcreateImplementor;

import DesignPatterns.StructuralPatterns.Bridge.Implementor.Account;

public class SavingAccount implements Account {

    @Override
    public void OpenAccount() {
        System.out.println("Saving Acount!");
    }
    
}

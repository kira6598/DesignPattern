package DesignPatterns.StructuralPatterns.Bridge.Client;

import DesignPatterns.StructuralPatterns.Bridge.Abstraction.Bank;
import DesignPatterns.StructuralPatterns.Bridge.ConcreateImplementor.CheckingAccout;
import DesignPatterns.StructuralPatterns.Bridge.RefinedAbstraction.TPbank;

public class Client {
    
    
    public static void main(String[] args) {
        Bank tpBank = new TPbank(new CheckingAccout());
        tpBank.OpenAccount();
    }

}

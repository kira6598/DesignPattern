package DesignPatterns.CreationalPatterns.FactoryPatern;

import DesignPatterns.CreationalPatterns.FactoryPatern.EnumType.BankType;
import DesignPatterns.CreationalPatterns.FactoryPatern.FactoryClass.BankFactory;
import DesignPatterns.CreationalPatterns.FactoryPatern.SuperClass.Bank;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName());
    }
}

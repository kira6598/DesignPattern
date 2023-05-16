package DesignPatterns.CreationalPatterns.FactoryPatern.FactoryClass;

import DesignPatterns.CreationalPatterns.FactoryPatern.EnumType.BankType;
import DesignPatterns.CreationalPatterns.FactoryPatern.SubClass.TPBank;
import DesignPatterns.CreationalPatterns.FactoryPatern.SubClass.VietcomBank;
import DesignPatterns.CreationalPatterns.FactoryPatern.SuperClass.Bank;

public class BankFactory {
    private BankFactory(){}
    public static final Bank getBank(BankType bankType){
        switch (bankType) {
            case TPBANK:
            return new TPBank();
            case VIETCOMBANK:
            return new VietcomBank();
            default: 
            throw new IllegalArgumentException("this bank type is not supported!");
        }
    }
}

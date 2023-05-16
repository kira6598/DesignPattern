package DesignPatterns.CreationalPatterns.FactoryPatern.SubClass;

import DesignPatterns.CreationalPatterns.FactoryPatern.SuperClass.Bank;

public class TPBank implements Bank {

    @Override
    public String getBankName() {
        return "TPBank";        
    }
    
}

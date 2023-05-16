package DesignPatterns.CreationalPatterns.FactoryPatern.SubClass;

import DesignPatterns.CreationalPatterns.FactoryPatern.SuperClass.Bank;

public class VietcomBank implements Bank
{

    @Override
    public String getBankName() {
        return "VietcomBank";
    }
    
}

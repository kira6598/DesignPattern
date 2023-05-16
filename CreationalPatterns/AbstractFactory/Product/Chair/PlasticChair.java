package DesignPatterns.CreationalPatterns.AbstractFactory.Product.Chair;

import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractProduct.Chair;

public class PlasticChair implements Chair {

    @Override
    public void create() {
       System.out.println("create a Plastic Chair");
    }
    
}

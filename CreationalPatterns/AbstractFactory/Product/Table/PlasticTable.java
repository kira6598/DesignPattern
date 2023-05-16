package DesignPatterns.CreationalPatterns.AbstractFactory.Product.Table;

import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractProduct.Table;

public class PlasticTable implements Table{

    @Override
    public void create() {
        System.out.println("create a Plastic Table");

    }
    
}

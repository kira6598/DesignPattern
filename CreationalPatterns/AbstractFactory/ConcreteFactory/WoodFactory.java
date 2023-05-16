package DesignPatterns.CreationalPatterns.AbstractFactory.ConcreteFactory;

import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractFatoryClass.FurnitureAbstractFactory;
import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractProduct.Chair;
import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractProduct.Table;
import DesignPatterns.CreationalPatterns.AbstractFactory.Product.Chair.WoodChair;
import DesignPatterns.CreationalPatterns.AbstractFactory.Product.Table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
       return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
    
}

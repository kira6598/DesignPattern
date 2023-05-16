package DesignPatterns.CreationalPatterns.AbstractFactory.ConcreteFactory;

import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractFatoryClass.FurnitureAbstractFactory;
import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractProduct.Chair;
import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractProduct.Table;
import DesignPatterns.CreationalPatterns.AbstractFactory.Product.Chair.PlasticChair;
import DesignPatterns.CreationalPatterns.AbstractFactory.Product.Table.PlasticTable;
public class PlasticFactory extends FurnitureAbstractFactory {


    @Override
    public Table createTable() {
        return new PlasticTable();
    }

    @Override
    public Chair createChair() {
      return new PlasticChair();
    }

}

package DesignPatterns.CreationalPatterns.AbstractFactory.Client;

import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractFatoryClass.FunitureFactory;
import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractFatoryClass.FurnitureAbstractFactory;
import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractFatoryClass.MaterialType;
import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractProduct.Chair;

public class Client {
    public static void main(String[] args) {
        FurnitureAbstractFactory WoodFactory = FunitureFactory.getFactory(MaterialType.WOOD);
        Chair woodChair= WoodFactory.createChair();
        woodChair.create();
    }
}

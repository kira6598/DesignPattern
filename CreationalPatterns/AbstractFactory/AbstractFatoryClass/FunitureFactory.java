package DesignPatterns.CreationalPatterns.AbstractFactory.AbstractFatoryClass;

import DesignPatterns.CreationalPatterns.AbstractFactory.ConcreteFactory.PlasticFactory;
import DesignPatterns.CreationalPatterns.AbstractFactory.ConcreteFactory.WoodFactory;

public class FunitureFactory {
    public static FurnitureAbstractFactory getFactory(MaterialType materialType){
        switch(materialType){
            case PLASTIC: 
            return new PlasticFactory();
            case WOOD:
            return new WoodFactory();
            default:
            throw new UnsupportedOperationException("this matterial is not produced");
        }
    }
}

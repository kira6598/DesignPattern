package DesignPatterns.CreationalPatterns.AbstractFactory.AbstractFatoryClass;

import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractProduct.Chair;
import DesignPatterns.CreationalPatterns.AbstractFactory.AbstractProduct.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();
    public abstract Table createTable();
}

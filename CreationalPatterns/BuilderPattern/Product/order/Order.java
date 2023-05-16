package DesignPatterns.CreationalPatterns.BuilderPattern.Product.order;

import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.BreadType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.OrderType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.SauceType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.VegetableType;

public class Order  {
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;
    public OrderType getOrderType() {
        return orderType;
    }
    public BreadType getBreadType() {
        return breadType;
    }
    public SauceType getSauceType() {
        return sauceType;
    }
    public VegetableType getVegetableType() {
        return vegetableType;
    }
    public Order(OrderType orderType, BreadType breadType, SauceType sauceType, VegetableType vegetableType) {
        super();
        this.orderType = orderType;
        this.breadType = breadType;
        this.sauceType = sauceType;
        this.vegetableType = vegetableType;
    }
    @Override
    public String toString() {
        return "Order [orderType=" + orderType + ", breadType=" + breadType + ", sauceType=" + sauceType
                + ", vegetableType=" + vegetableType + "]";
    }

   

     


}

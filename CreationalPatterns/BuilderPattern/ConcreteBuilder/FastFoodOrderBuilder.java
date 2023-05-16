package DesignPatterns.CreationalPatterns.BuilderPattern.ConcreteBuilder;

import DesignPatterns.CreationalPatterns.BuilderPattern.Builder.OrderBuilder;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.BreadType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.OrderType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.SauceType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.VegetableType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.order.Order;

public class FastFoodOrderBuilder implements OrderBuilder {

    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;
    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType=orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }
 
    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }
 
    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }
    
}

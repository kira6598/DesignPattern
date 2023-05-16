package DesignPatterns.CreationalPatterns.BuilderPattern.Builder;

import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.BreadType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.OrderType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.SauceType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.VegetableType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.order.Order;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);
 
    OrderBuilder orderBread(BreadType breadType);
 
    OrderBuilder orderSauce(SauceType sauceType);
 
    OrderBuilder orderVegetable(VegetableType vegetableType);
 
    Order build();

}

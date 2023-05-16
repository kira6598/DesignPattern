package DesignPatterns.CreationalPatterns.BuilderPattern.Client;

import DesignPatterns.CreationalPatterns.BuilderPattern.ConcreteBuilder.FastFoodOrderBuilder;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.BreadType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.OrderType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.OrderType.SauceType;
import DesignPatterns.CreationalPatterns.BuilderPattern.Product.order.Order;

public class Client {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
        .orderType(OrderType.TAKE_AWAY).orderSauce(SauceType.MUSTARD)
        .orderBread(BreadType.BEEF).build();
        System.out.println(order);
    

    }
}

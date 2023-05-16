package DesignPatterns.BehavioralPattern.Iterator.Client;

import DesignPatterns.BehavioralPattern.Iterator.ConcreteAggregate.Menu;
import DesignPatterns.BehavioralPattern.Iterator.ConcreteIterator.Item;
import DesignPatterns.BehavioralPattern.Iterator.Iterator.ItemIterator;

public class Client {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItem(new Item("Home", "/home"));
        menu.addItem(new Item("Java", "/java"));
        menu.addItem(new Item("Spring Boot", "/spring-boot"));

        ItemIterator<Item> inIterator= menu.interator();
        while(inIterator.hasNext()){
            System.out.println(inIterator.next());
        }
    }

}

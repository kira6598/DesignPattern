package DesignPatterns.StructuralPatterns.Flyweight.ConcreteFlyweight;

import DesignPatterns.StructuralPatterns.Flyweight.Flyweight.Context;
import DesignPatterns.StructuralPatterns.Flyweight.Flyweight.ISoldier;

public class Soldier implements ISoldier {

    private final String name;

    public Soldier(String name) {
        this.name = name;
        System.out.println("Soldier is created! - " + name);
    }

    @Override
    public void promote(Context context) {
       System.out.println(name+ " "+ context.getId()+ " "+ context.getStart());
    }
    @Override
    public String toString(){
        return "Soldier [name: "+name+ "]";
    }
    
}

package DesignPatterns.StructuralPatterns.Flyweight.Client;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import DesignPatterns.StructuralPatterns.Flyweight.Flyweight.Context;
import DesignPatterns.StructuralPatterns.Flyweight.Flyweight.ISoldier;
import DesignPatterns.StructuralPatterns.Flyweight.FlyweightFactory.SoldierFactory;

public class GameApp {
    private static List<ISoldier> soldiers = new ArrayList<>();
    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        createSoldier(5, "Yuri", 1);
        createSoldier(5, "Spy", 1);
        createSoldier(3, "Spy", 3);
        createSoldier(2, "Yuri", 2);
        long endTime = System.currentTimeMillis();
        System.out.println("---");
        System.out.println("Total soldiers made : " + soldiers.size());
        System.out.println("Total time worked : " + Duration.ofMillis(endTime - startTime).getSeconds() + " seconds");
        System.out.println("Total type of soldiers made : " + SoldierFactory.getTotalOfSoldiers());
        for (ISoldier soldier : soldiers) {
            System.out.println(soldier);
        }
    }
    
    private static void createSoldier(int NumberOfSoldier,String SoldierName,int NumberOfStar){
        for (int i = 0; i < NumberOfSoldier; i++) {
            Context start = new Context("Soldier"+(soldiers.size()+1), NumberOfStar);
            ISoldier soldier= SoldierFactory.createSoldier(SoldierName);
            soldier.promote(start);
            soldiers.add(soldier);
        }
    }
}

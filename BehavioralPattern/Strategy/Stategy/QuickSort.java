package DesignPatterns.BehavioralPattern.Strategy.Stategy;

import java.util.List;

public class QuickSort implements Sortstrategy {

    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Quick Sort");
    }

    
    
}

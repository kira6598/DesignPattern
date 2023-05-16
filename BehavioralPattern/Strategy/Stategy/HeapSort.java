package DesignPatterns.BehavioralPattern.Strategy.Stategy;

import java.util.List;

public class HeapSort implements Sortstrategy {

    @Override
    public <T> void sort(List<T> items) {
       System.out.println("Heap Sort");
    }
    
}

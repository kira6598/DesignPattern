package DesignPatterns.BehavioralPattern.Strategy.Context;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns.BehavioralPattern.Strategy.Stategy.Sortstrategy;

public class SortedList {
    private Sortstrategy sortstrategy;
    private List<String> items = new ArrayList<>();


    public void setSortstrategy(Sortstrategy sortstrategy) {
        this.sortstrategy = sortstrategy;
    }
    public SortedList(List<String> items) {
        this.items = items;
    }


    public void sort(){
        sortstrategy.sort(items);
    }
}

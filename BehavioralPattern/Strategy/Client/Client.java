package DesignPatterns.BehavioralPattern.Strategy.Client;
import java.util.ArrayList;
import java.util.List;

import DesignPatterns.BehavioralPattern.Strategy.Context.SortedList;
import DesignPatterns.BehavioralPattern.Strategy.Stategy.HeapSort;
public class Client {
    public static void main(String[] args) {
        String e1= "ahuhu";
        String e2= "ehehe";
        List<String> items= new ArrayList<>();
        items.add(e1);
        items.add(e2);

        SortedList sortedList = new SortedList(items);
        sortedList.setSortstrategy(new HeapSort());
        sortedList.sort();

    }
}

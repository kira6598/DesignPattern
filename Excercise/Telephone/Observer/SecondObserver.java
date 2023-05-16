package DesignPatterns.Excercise.Telephone.Observer;

import java.util.ArrayList;
import java.util.List;

public class SecondObserver implements Observer {
   
    private List<Integer> phoneNums= new ArrayList<>();
    private int count=0;

    @Override
    public void update(int num) {
        phoneNums.add(num);
        count++;
        if(count ==10){
            System.out.print("Now dialing ");
            printArr(phoneNums);
            System.out.print("...");
        }
        
    }
    private void printArr(List<Integer> list){
        for (Integer integer : list) {
            System.out.print(integer);
        }
    }
    
}

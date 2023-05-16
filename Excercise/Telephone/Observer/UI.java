package DesignPatterns.Excercise.Telephone.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    private  List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void calling(){
        System.out.println(" a phone number have 10 digist number, we will automaticly dialing to that number after you type 10 digits number ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Pressing: ");
            int input= scanner.nextInt();
            notifyToObservers(input);


        }
        scanner.close();
    }
    private void notifyToObservers(int numb){
        for (Observer observer : observers) {
            observer.update(numb);
        }
    }

}

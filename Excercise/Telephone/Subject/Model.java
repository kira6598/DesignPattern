package DesignPatterns.Excercise.Telephone.Subject;

import DesignPatterns.Excercise.Telephone.Observer.FirstObserver;
import DesignPatterns.Excercise.Telephone.Observer.SecondObserver;
import DesignPatterns.Excercise.Telephone.Observer.UI;

public interface Model {
    public static void main(String[] args) {
        UI ui = new UI();
        FirstObserver keyboard = new FirstObserver();
        SecondObserver screen = new SecondObserver();
        ui.addObserver(keyboard);
        ui.addObserver(screen);
        ui.calling();
    }
}

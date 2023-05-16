package DesignPatterns.BehavioralPattern.Observer.Subject;

import DesignPatterns.BehavioralPattern.Observer.observer.Observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllObserver();
}

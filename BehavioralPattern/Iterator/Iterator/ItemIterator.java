package DesignPatterns.BehavioralPattern.Iterator.Iterator;

public interface ItemIterator<T> {
    boolean hasNext();
    T next();
}

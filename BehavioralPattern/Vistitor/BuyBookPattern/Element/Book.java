package DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.Element;

import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.Visitor.VisitBook;

public interface Book {
    void accept(VisitBook v);
}

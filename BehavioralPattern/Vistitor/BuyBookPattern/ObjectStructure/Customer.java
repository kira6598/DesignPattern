package DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.ObjectStructure;

import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.Element.Book;
import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.Visitor.VisitBook;

public interface Customer extends VisitBook {
    void buy(Book book);
}

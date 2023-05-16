package DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.ConcreteElement;

import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.Element.Book;
import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.Visitor.VisitBook;

public class ProgramingBook implements Book {

    @Override
    public void accept(VisitBook v) {
       v.visit(this);
    }
    
}

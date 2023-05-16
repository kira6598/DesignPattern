package DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteElement;

import DesignPatterns.BehavioralPattern.Vistitor.Book.Element.Book;
import DesignPatterns.BehavioralPattern.Vistitor.Book.Visitor.Visitor;

public class BusinessBook implements Book {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    public String getPublisher(){
        return "The publisher of business book";
    }
}

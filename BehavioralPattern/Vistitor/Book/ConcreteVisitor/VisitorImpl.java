package DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteVisitor;

import DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteElement.BusinessBook;
import DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteElement.DesignPatternBook;
import DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteElement.JavaCoreBook;
import DesignPatterns.BehavioralPattern.Vistitor.Book.Element.Book;
import DesignPatterns.BehavioralPattern.Vistitor.Book.Visitor.Visitor;

public class VisitorImpl implements Visitor {

    @Override
    public void visit(BusinessBook book) {
       System.out.println(book.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println(book.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println(book.getFavouriteBook());
    }

    @Override
    public void visit(Book book) {
        System.out.println("hi!, i'm a Book");
    }
    
}

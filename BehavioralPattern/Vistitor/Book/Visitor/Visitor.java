package DesignPatterns.BehavioralPattern.Vistitor.Book.Visitor;

import DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteElement.BusinessBook;
import DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteElement.DesignPatternBook;
import DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteElement.JavaCoreBook;
import DesignPatterns.BehavioralPattern.Vistitor.Book.Element.Book;

public interface Visitor {
    void visit(Book book);
    void visit(BusinessBook book);
    void visit(DesignPatternBook book);
    void visit(JavaCoreBook book);
}

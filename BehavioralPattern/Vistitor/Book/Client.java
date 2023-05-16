package DesignPatterns.BehavioralPattern.Vistitor.Book;

import DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteElement.BusinessBook;
import DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteElement.JavaCoreBook;
import DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteVisitor.VisitorImpl;
import DesignPatterns.BehavioralPattern.Vistitor.Book.Element.Book;
import DesignPatterns.BehavioralPattern.Vistitor.Book.Visitor.Visitor;

public class Client {
    public static void main(String[] args) {
        Book bussinesBook= new BusinessBook();
        Book javacoreBook = new JavaCoreBook();
        Visitor visitor = new VisitorImpl();
        bussinesBook.accept(visitor);
        javacoreBook.accept(visitor);
    }
}

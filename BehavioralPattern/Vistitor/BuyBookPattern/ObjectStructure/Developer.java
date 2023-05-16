package DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.ObjectStructure;


import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.ConcreteElement.BusinessBook;
import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.ConcreteElement.ProgramingBook;
import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.Element.Book;

public class Developer implements Customer{

    @Override
    public void buy(Book book) {
        book.accept(this);
    }

    @Override
    public void visit(BusinessBook book) {
       System.out.println("Developer buy BusinessBook");
    }

    @Override
    public void visit(ProgramingBook book) {
        System.out.println("Developer buy ProgramingBook");
    }
    
}

package DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.Visitor;

import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.ConcreteElement.BusinessBook;
import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.ConcreteElement.ProgramingBook;

public interface VisitBook {
    void visit(BusinessBook book);
    void visit(ProgramingBook book);
}

package DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteElement;

import DesignPatterns.BehavioralPattern.Vistitor.Book.Element.ProgramingBook;
import DesignPatterns.BehavioralPattern.Vistitor.Book.Visitor.Visitor;

public class DesignPatternBook implements ProgramingBook{

    @Override
    public void accept(Visitor v) {
       v.visit(this);
    }

    @Override
    public String getResource() {
       return "Design Pattern Resource";
    }
    public String getBestSeller(){
        return "best seller design pattern";
    }
    
}

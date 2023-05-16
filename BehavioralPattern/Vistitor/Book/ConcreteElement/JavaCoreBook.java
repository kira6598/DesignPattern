package DesignPatterns.BehavioralPattern.Vistitor.Book.ConcreteElement;

import DesignPatterns.BehavioralPattern.Vistitor.Book.Element.ProgramingBook;
import DesignPatterns.BehavioralPattern.Vistitor.Book.Visitor.Visitor;

public class JavaCoreBook implements ProgramingBook{

    @Override
    public void accept(Visitor v) {
       v.visit(this);
    }

    @Override
    public String getResource() {
       return "Java Core Resource";
    }
  
    public String getFavouriteBook(){
        return "favourite book java core";
    }

    
}
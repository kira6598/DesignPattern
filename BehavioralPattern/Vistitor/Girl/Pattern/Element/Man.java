package DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Element;

import DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.ConcreteElement.HotGirl;
import DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Visitor.Visitor;

public  class Man implements Visitor {

    public  void kiss(Woman woman){
        woman.accept(this);
    }

    @Override
    public void visit(Girl girl) {
        System.out.println(" Man kiss Girl ");
    }

    @Override
    public void visit(HotGirl girl) {
        System.out.println("Man kiss hot girl");
    }

}

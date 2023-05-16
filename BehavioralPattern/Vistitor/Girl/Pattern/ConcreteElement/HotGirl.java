package DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.ConcreteElement;

import DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Element.Girl;
import DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Visitor.Visitor;

public class HotGirl extends Girl {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

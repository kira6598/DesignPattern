package DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Visitor;

import DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.ConcreteElement.HotGirl;
import DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Element.Girl;

public interface Visitor {
    void visit(Girl girl);
    void visit(HotGirl girl);
}

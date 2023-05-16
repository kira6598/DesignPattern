package DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Element;

import DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Visitor.Visitor;

public  class Girl implements Woman {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

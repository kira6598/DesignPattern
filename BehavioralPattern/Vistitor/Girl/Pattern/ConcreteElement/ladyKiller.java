package DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.ConcreteElement;

import DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Element.Girl;
import DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Element.Man;

public class ladyKiller extends Man {
    @Override
    public void visit(Girl girl) {
        System.out.println("a LadyKiller kissed a Girl");
    }

    @Override
    public void visit(HotGirl hotGirl) {
        System.out.println("a LadyKiller kissed a Hot girl");
    }
}

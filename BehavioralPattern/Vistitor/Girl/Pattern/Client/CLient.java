package DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Client;

import DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.ConcreteElement.HotGirl;
import DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Element.Girl;
import DesignPatterns.BehavioralPattern.Vistitor.Girl.Pattern.Element.Man;

public class CLient {

    public static void main(String[] args) {
        
        Girl girl = new HotGirl();
        Man man = new Man();
        man.kiss(girl);
    }
}

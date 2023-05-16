package DesignPatterns.BehavioralPattern.TemplateMethod.ConcreteClass;

import DesignPatterns.BehavioralPattern.TemplateMethod.AbstractClass.PageTemplate;

public class HomePage extends PageTemplate  {

    @Override
    protected void showBody() {
       System.out.println("Home page");
    }
    
}

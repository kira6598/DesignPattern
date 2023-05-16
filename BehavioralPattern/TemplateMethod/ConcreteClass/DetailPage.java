package DesignPatterns.BehavioralPattern.TemplateMethod.ConcreteClass;

import DesignPatterns.BehavioralPattern.TemplateMethod.AbstractClass.PageTemplate;

public class DetailPage extends PageTemplate {

    @Override
    protected void showBody() {
       System.out.println("Detail Page");
    }
    
}

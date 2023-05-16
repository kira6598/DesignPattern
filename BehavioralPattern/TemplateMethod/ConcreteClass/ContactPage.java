package DesignPatterns.BehavioralPattern.TemplateMethod.ConcreteClass;

import DesignPatterns.BehavioralPattern.TemplateMethod.AbstractClass.PageTemplate;

public class ContactPage extends PageTemplate {

    @Override
    public void showBody() {
       System.out.println("Contact page");
    }
    
}

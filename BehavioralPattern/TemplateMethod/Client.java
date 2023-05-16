package DesignPatterns.BehavioralPattern.TemplateMethod;

import DesignPatterns.BehavioralPattern.TemplateMethod.AbstractClass.PageTemplate;
import DesignPatterns.BehavioralPattern.TemplateMethod.ConcreteClass.ContactPage;
import DesignPatterns.BehavioralPattern.TemplateMethod.ConcreteClass.DetailPage;
import DesignPatterns.BehavioralPattern.TemplateMethod.ConcreteClass.HomePage;

public class Client {
    public static void main(String[] args) {
        PageTemplate homePage= new HomePage();
        homePage.showPage();;
        PageTemplate detaiPage= new DetailPage();
        detaiPage.showPage();
        PageTemplate contactPage= new ContactPage();
        contactPage.showPage();

    }
}

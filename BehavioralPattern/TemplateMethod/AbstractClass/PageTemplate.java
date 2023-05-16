package DesignPatterns.BehavioralPattern.TemplateMethod.AbstractClass;

public abstract class PageTemplate {
   
    protected void showHeader(){
        System.out.println("<header />");
    }
    protected void showNavigation(){
        System.out.println("<nav />");
    };

    protected void showFooter(){
        System.out.println("<footer />");
    };
    protected abstract void showBody();
    public final void showPage(){
        System.out.println(this.getClass() + " execute showPage()");
        showHeader();
        showNavigation();
        showBody();
        showFooter();
        System.out.println("-------------------");

    }
}

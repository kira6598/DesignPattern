package DesignPatterns.StructuralPatterns.Decorator.ConcreteComponent;

import java.util.Date;

import DesignPatterns.StructuralPatterns.Decorator.Component.EmployeeComponent;

public class EmployeeConcreateComponent implements EmployeeComponent{
    private String name;   
    

    public EmployeeConcreateComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void dotask() {
        System.out.println("do something");
    }

    @Override
    public void joinDate(Date joinDate) {
        
     System.out.println(this.getName()+" join@");
    }

    @Override
    public void terminate(Date terminateDate) {
        System.out.println(this.getName()+"terminate");
    
    }
    
}

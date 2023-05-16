package DesignPatterns.StructuralPatterns.Decorator.Client;

import DesignPatterns.StructuralPatterns.Decorator.Component.EmployeeComponent;
import DesignPatterns.StructuralPatterns.Decorator.ConcreteComponent.EmployeeConcreateComponent;
import DesignPatterns.StructuralPatterns.Decorator.ConcreteDecorator.Manager;
import DesignPatterns.StructuralPatterns.Decorator.ConcreteDecorator.TeamLead;

public class Client {
    public static void main(String[] args) {
        System.out.println("Normal employee");
        EmployeeComponent employee = new EmployeeConcreateComponent("son");
        employee.dotask();

        System.out.println("teamLead");
        EmployeeComponent teamLead = new TeamLead(employee);
        teamLead.dotask();

        System.out.println("Manager");
        EmployeeComponent Mangaer = new Manager(employee);
        Mangaer.dotask();

        System.out.println("teamlead and manager");
        EmployeeComponent teamLeadAndManager = new Manager(teamLead);
        teamLeadAndManager.dotask();
    }
}

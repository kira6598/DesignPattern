package DesignPatterns.StructuralPatterns.Decorator.ConcreteDecorator;
import DesignPatterns.StructuralPatterns.Decorator.Component.EmployeeComponent;
import DesignPatterns.StructuralPatterns.Decorator.Decorator.EmployeeDecorator;

public class TeamLead extends EmployeeDecorator {
    public TeamLead(EmployeeComponent employee) {
        super(employee);   
    }

    @Override
    public void dotask() {
        employee.dotask();
        planning();
        monitor();
        motivative();
        }


    void planning(){
        System.out.println(this.employee.getName()+" is planning");
    }
    void motivative(){
        System.out.println(this.employee.getName()+" is motivative");
    }
    void monitor(){
        System.out.println(this.employee.getName()+" is monitoring");
    }
}

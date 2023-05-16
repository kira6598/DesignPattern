package DesignPatterns.StructuralPatterns.Decorator.ConcreteDecorator;
import DesignPatterns.StructuralPatterns.Decorator.Component.EmployeeComponent;
import DesignPatterns.StructuralPatterns.Decorator.Decorator.EmployeeDecorator;

public class TeamMember extends EmployeeDecorator {

    public TeamMember(EmployeeComponent employee) {
        super(employee);
    }

    @Override
    public void dotask() {
        employee.dotask();
        performTask();
        coordinateWithOther();
    }

    
    public void performTask(){
        System.out.println(this.employee.getName()+" is performing task!");
    }
    public void coordinateWithOther(){
        System.out.println(this.employee.getName()+" is coordinateWithOther!");
    }
}

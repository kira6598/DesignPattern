package DesignPatterns.StructuralPatterns.Decorator.ConcreteDecorator;
import DesignPatterns.StructuralPatterns.Decorator.Component.EmployeeComponent;
import DesignPatterns.StructuralPatterns.Decorator.Decorator.EmployeeDecorator;

public class Manager extends EmployeeDecorator{
    public Manager(EmployeeComponent employee) {
        super(employee); 
    }


    void CreateRequirement(){
        System.out.println(this.employee.getName()+" is creating a requirement");
    }
    void assignTask(){
        System.out.println(this.employee.getName()+" is assigning task to employee");
    }
    void manageProcess(){
        System.out.println(this.employee.getName()+" is managing process!");
    }

    @Override
    public void dotask() {
        employee.dotask();
        CreateRequirement();
        assignTask();
        manageProcess();
    }
}

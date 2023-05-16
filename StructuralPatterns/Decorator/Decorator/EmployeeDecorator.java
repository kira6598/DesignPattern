package DesignPatterns.StructuralPatterns.Decorator.Decorator;

import java.util.Date;

import DesignPatterns.StructuralPatterns.Decorator.Component.EmployeeComponent;

public abstract class EmployeeDecorator  implements EmployeeComponent{
    protected EmployeeComponent employee;

    public EmployeeDecorator(EmployeeComponent employee) {
        this.employee = employee;
    }
    @Override
    public String getName(){
        return employee.getName();
    }
    @Override
    public void joinDate(Date date){
        employee.joinDate(date);
    }
    @Override
    public void terminate(Date date){
        employee.terminate(date);
    }
    
}

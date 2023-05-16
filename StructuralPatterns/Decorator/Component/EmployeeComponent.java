package DesignPatterns.StructuralPatterns.Decorator.Component;

import java.util.Date;

public interface EmployeeComponent {
    String getName();
    void dotask();
    void joinDate(Date joinDate);
    void terminate(Date terminateDate);
    
}

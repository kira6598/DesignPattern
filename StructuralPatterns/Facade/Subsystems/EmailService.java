package DesignPatterns.StructuralPatterns.Facade.Subsystems;

public class EmailService {
    public void sendMail(String mailTo) {
        System.out.println("Sending an email to " + mailTo);
    }
}

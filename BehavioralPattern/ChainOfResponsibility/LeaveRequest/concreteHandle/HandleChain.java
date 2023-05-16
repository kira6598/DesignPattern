package DesignPatterns.BehavioralPattern.ChainOfResponsibility.LeaveRequest.concreteHandle;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.LeaveRequest.handle.Approver;

public class HandleChain {
    public static Approver getHandle(){
        Approver suppervisor = new Supervisor();
        Approver deliveryMangager = new DelieveryManager();
        Approver director = new Director();

        suppervisor.setNext(deliveryMangager);
        deliveryMangager.setNext(director);
        return suppervisor;
    }
}

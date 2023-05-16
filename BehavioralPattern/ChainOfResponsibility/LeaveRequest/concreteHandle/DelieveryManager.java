package DesignPatterns.BehavioralPattern.ChainOfResponsibility.LeaveRequest.concreteHandle;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.LeaveRequest.handle.Approver;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.LeaveRequest.handle.LeaveRequest;

public class DelieveryManager extends Approver {

    @Override
    protected boolean canApprove(int numberOfDay) {
        return numberOfDay <=5;
    }

    @Override
    protected void doApproving(LeaveRequest requets) {
       System.out.println("Delivery approved Leave request for " +requets.getDays()+" days");
    }
    
}

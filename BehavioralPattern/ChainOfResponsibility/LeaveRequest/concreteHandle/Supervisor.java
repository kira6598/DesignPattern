package DesignPatterns.BehavioralPattern.ChainOfResponsibility.LeaveRequest.concreteHandle;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.LeaveRequest.handle.Approver;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.LeaveRequest.handle.LeaveRequest;

public class Supervisor extends Approver {


    @Override
    protected boolean canApprove(int numberOfDay) {
        return numberOfDay<3;
    }

    @Override
    protected void doApproving(LeaveRequest requets) {
        System.out.println("SuperVisor approved Request for "+requets.getDays()+" days");
    }
    
}

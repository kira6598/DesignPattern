package DesignPatterns.BehavioralPattern.ChainOfResponsibility.LeaveRequest.client;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.LeaveRequest.concreteHandle.HandleChain;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.LeaveRequest.handle.LeaveRequest;

public class Client {
    public static void main(String[] args) {
        HandleChain.getHandle().approveLeave(new LeaveRequest(7));
    }
}

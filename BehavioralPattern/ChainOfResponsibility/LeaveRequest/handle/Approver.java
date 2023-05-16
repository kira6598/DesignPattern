package DesignPatterns.BehavioralPattern.ChainOfResponsibility.LeaveRequest.handle;

public abstract class Approver {
    Approver nextApprover;


    public void  setNext(Approver approver){
        this.nextApprover= approver;
    };
    public void approveLeave(LeaveRequest request){
       if(this.canApprove(request.getDays())){
        this.doApproving(request);
       }else if(nextApprover!=null){
            nextApprover.approveLeave(request);
       }
    }
    protected abstract boolean canApprove(int numberOfDay);
    protected abstract void doApproving(LeaveRequest requets);

}

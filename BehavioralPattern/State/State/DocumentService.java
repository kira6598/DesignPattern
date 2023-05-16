package DesignPatterns.BehavioralPattern.State.State;

import DesignPatterns.BehavioralPattern.State.ConcreteState.Approved;
import DesignPatterns.BehavioralPattern.State.ConcreteState.New;
import DesignPatterns.BehavioralPattern.State.ConcreteState.Rejected;
import DesignPatterns.BehavioralPattern.State.ConcreteState.Submitted;
import DesignPatterns.BehavioralPattern.State.Context.DocumentRequest;

public class DocumentService implements State{
    private DocumentRequest request;
    public void setRequest(DocumentRequest request) {
        this.request = request;
    }
    private State state;

    public DocumentService(DocumentRequest request) {
        this.request = request;
    }

    public DocumentService(){}
    @Override
    public void handle() {
        //Factory Pattern
        switch(request){
            case NEW :{
                state= new New(); 
                break;               
            }
            case APPROVED:{
                state= new Approved();
                break;
            }
            case SUBMITTED :{
                state = new Submitted();
                break;
            }
            case REJECTED:{
                state = new Rejected();
                break;
            }
            default : {
                throw new UnsupportedOperationException("Unsupport that request!!!");
            }
        }
            state.handle();
    }
    
}

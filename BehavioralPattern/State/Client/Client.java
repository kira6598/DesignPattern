package DesignPatterns.BehavioralPattern.State.Client;

import DesignPatterns.BehavioralPattern.State.Context.DocumentRequest;
import DesignPatterns.BehavioralPattern.State.State.DocumentService;

public class Client {
    public static void main(String[] args) {
        DocumentRequest rejectedRequest = DocumentRequest.REJECTED;
        DocumentService service = new DocumentService();
        service.setRequest(rejectedRequest);
        service.handle();
    }
}

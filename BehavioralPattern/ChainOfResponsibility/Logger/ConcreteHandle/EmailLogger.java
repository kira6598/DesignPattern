package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.ConcreteHandle;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.Handle.LogLevel;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.Handle.Logger;

public class EmailLogger extends Logger {
 
    public EmailLogger(LogLevel logLevel) {
        super(logLevel);
    }
 
    @Override
    protected void writeMessage(String msg) {
        System.out.println("Email logger: " + msg);
    }
}

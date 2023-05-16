package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.ConcreteHandle;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.Handle.LogLevel;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.Handle.Logger;

public class ConsoleLogger extends Logger {
 
    public ConsoleLogger(LogLevel logLevel) {
        super(logLevel);
    }
 
    @Override
    protected void writeMessage(String msg) {
        System.out.println("Console logger: " + msg);
    }
}

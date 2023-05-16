package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.ConcreteHandle;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.Handle.LogLevel;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.Handle.Logger;

public class AppLogger {
    public static Logger getLogger(){
        Logger consoleLogger = new ConsoleLogger(LogLevel.DEBUG);
        Logger fileLogger = consoleLogger.setNext(new FileLogger(LogLevel.ERROR));
        fileLogger.setNext(new EmailLogger(LogLevel.FATAL));
        return consoleLogger;

    }
}

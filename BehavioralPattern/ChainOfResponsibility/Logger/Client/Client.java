package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.Client;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.ConcreteHandle.AppLogger;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.Handle.LogLevel;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.Handle.Logger;

public class Client {
    public static void main(String[] args) {
        Logger logger = AppLogger.getLogger();
        logger.log(LogLevel.INFO, "Info message");
        logger.log(LogLevel.DEBUG, "Debug message");
                // Handled by ConsoleLogger and FileLogger
                logger.log(LogLevel.ERROR, "Error message");
 
                // Handled by ConsoleLogger, FileLogger, EmailLogger
                logger.log(LogLevel.FATAL, "Factal message");
    }
}

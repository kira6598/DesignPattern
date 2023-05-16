package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Logger.Handle;

public  enum LogLevel {
    NONE(0), INFO(1), DEBUG(2), WARNING(4), ERROR(8), FATAL(16), ALL(32);
    private int lever;
    public int getLever() {
        return lever;
    }
    private LogLevel(int level){
        this.lever= level;
    }
    
}

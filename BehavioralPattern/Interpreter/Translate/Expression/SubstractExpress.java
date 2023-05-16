package DesignPatterns.BehavioralPattern.Interpreter.Translate.Expression;

import DesignPatterns.BehavioralPattern.Interpreter.Translate.Context.InterpreterEngineContext;

public class SubstractExpress implements Expression {
    private String express;

    public SubstractExpress(String express) {
        this.express = express;
    }

    @Override
    public int interpret(InterpreterEngineContext context) {
        return context.substract(express);
    }
    

}

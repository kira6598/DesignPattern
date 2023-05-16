package DesignPatterns.BehavioralPattern.Interpreter.Translate.Expression;

import DesignPatterns.BehavioralPattern.Interpreter.Translate.Context.InterpreterEngineContext;

public class AddExpress implements Expression {
    private String expression;
    public AddExpress(String expression) {
        this.expression = expression;
    }
    @Override
    public int interpret(InterpreterEngineContext context) {
        return context.add(expression);       
    }
    
}

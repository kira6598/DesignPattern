package DesignPatterns.BehavioralPattern.Interpreter.Translate.Expression;

import DesignPatterns.BehavioralPattern.Interpreter.Translate.Context.InterpreterEngineContext;

public interface Expression {
    int interpret(InterpreterEngineContext context);
}

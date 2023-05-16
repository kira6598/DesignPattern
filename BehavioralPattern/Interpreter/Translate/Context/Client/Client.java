package DesignPatterns.BehavioralPattern.Interpreter.Translate.Context.Client;
import DesignPatterns.BehavioralPattern.Interpreter.Translate.Context.InterpreterEngineContext;
import DesignPatterns.BehavioralPattern.Interpreter.Translate.Expression.AddExpress;
import DesignPatterns.BehavioralPattern.Interpreter.Translate.Expression.Expression;
import DesignPatterns.BehavioralPattern.Interpreter.Translate.Expression.SubstractExpress;

public class Client {
    public static void main(String[] args) {
        System.out.println("20 add 8 = " + interpret("20 add 8"));
        System.out.println("10 subtract 4 = " + interpret("10 subtract 4"));
        
    }
    private static int interpret(String input){
        //Factory
        Expression exp = null;
        if(input.contains("add")){
            exp = new AddExpress(input);
        }else if(input.contains("subtract")){
            exp = new SubstractExpress(input);
        }else{
            throw new UnsupportedOperationException();
        }
        return exp.interpret(new InterpreterEngineContext());
    }
}

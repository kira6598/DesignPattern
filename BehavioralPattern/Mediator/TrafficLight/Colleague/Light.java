package DesignPatterns.BehavioralPattern.Mediator.TrafficLight.Colleague;

import DesignPatterns.BehavioralPattern.Mediator.TrafficLight.Mediator.LightMediator;

public class Light {
     
    public enum State{
        ON,OFF
    };
    public String color;
    public LightMediator lightMediator;
    public State currentState;
    public Light(String color, LightMediator lightMediator) {
        this.color = color;
        this.lightMediator = lightMediator;
    }

    public void turnOn(){
       this.currentState=State.ON;
       lightMediator.SendSignal(this);
    }
    public void turnOff(){
        this.currentState= State.OFF;
        lightMediator.SendSignal(this);
    }
    public String getColor() {
        return color;
    }
 
    public State getCurrentState() {
        return currentState;
    }
 
    @Override
    public int hashCode() {
        return color.hashCode();
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
 
        }
 
        if (this.getClass() != obj.getClass()) {
            return false;
        }
         
        Light light = (Light) obj;
        return color.equals(light.color);
    }

    
}


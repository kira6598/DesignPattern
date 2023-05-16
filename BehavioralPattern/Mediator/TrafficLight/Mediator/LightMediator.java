package DesignPatterns.BehavioralPattern.Mediator.TrafficLight.Mediator;
import java.util.HashSet;

import java.util.Set;

import DesignPatterns.BehavioralPattern.Mediator.TrafficLight.Colleague.Light;
import DesignPatterns.BehavioralPattern.Mediator.TrafficLight.Colleague.Light.State;


public class LightMediator {

    private Set<Light> lights= new HashSet<>();
    

    public void SendSignal(Light light){    
        System.out.println(light.getColor() +" is turn" +light.getCurrentState());
        if(light.getCurrentState()==State.ON){
            turnOffAll(light);
        }
    }

    private void turnOffAll(Light light){
        for (Light lightE : lights) {
            if(!(lightE.equals(light))){
                lightE.turnOff();
            }
        }
        System.out.println("----------");
    }
    public void addLight(Light light){
        lights.add(light);
    }
}

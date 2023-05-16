package DesignPatterns.BehavioralPattern.Mediator.TrafficLight.Client;

import java.util.concurrent.TimeUnit;

import DesignPatterns.BehavioralPattern.Mediator.TrafficLight.Colleague.Light;
import DesignPatterns.BehavioralPattern.Mediator.TrafficLight.Mediator.LightMediator;

public class Client {
    public static void main(String[] args) {
        LightMediator mediator = new LightMediator();
        Light red= new Light("red", mediator);
        Light green = new Light("green", mediator);
        Light yellow= new Light("yellow", mediator);

        mediator.addLight(yellow);
        mediator.addLight(green);
        mediator.addLight(red);
        Light[] lights = {red,green,yellow};
        int currentIndex=0;
        Light light;
        while(true){
            if(currentIndex>=lights.length){
                currentIndex=0;
            }
            light=lights[currentIndex];
            light.turnOn();
            timer();
            currentIndex++;
        }

    }
    private static void timer(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}

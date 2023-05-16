package DesignPatterns.BehavioralPattern.Memeto.easyExample;

import java.util.ArrayList;
import java.util.List;

public class Originator {
    private String state;
    public String getState() {
        return state;
    }
    public void set(String state){
        System.out.println("Originator: Setting state to "+state);
        this.state=state;
    }
    public Memento saveToMementor(){
        System.out.println("Originator: Saving to Mementor.");
        return new Memento(state);
    }
    public void restoreFromMementor(Memento memetor){
        this.state=memetor.getSavedState();
        System.out.println("Originator: State after restoring from memetor is "+state);
    }

    public static class Memento{
        private final String state;
        public Memento(String stateToSave){
            state=stateToSave;
        }
        public String getSavedState(){
            return state;
        }
        
    }
}
class Example{
    public static void main(String[] args) {
        List<Originator.Memento> savedState= new ArrayList<>();
        Originator originator = new Originator();
        originator.set("state 1");
        savedState.add(originator.saveToMementor());
        originator.set("state 2");
        savedState.add(originator.saveToMementor());
        originator.set("ahihi");
        originator.restoreFromMementor(savedState.get(0));
        originator.restoreFromMementor(savedState.get(1));
        originator.set("ahoho");
        System.out.println("current state is "+originator.getState());

    }
}

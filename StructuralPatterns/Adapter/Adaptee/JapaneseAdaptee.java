package DesignPatterns.StructuralPatterns.Adapter.Adaptee;

public class JapaneseAdaptee {
  public  void receive(String word){
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(word);
    }
}

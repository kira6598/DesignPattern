package DesignPatterns.StructuralPatterns.Adapter.Adapter;

import DesignPatterns.StructuralPatterns.Adapter.Adaptee.JapaneseAdaptee;
import DesignPatterns.StructuralPatterns.Adapter.Target.VietnameseTarget;

public class TranslatorAdapter implements VietnameseTarget{
    private JapaneseAdaptee japaneseAdaptee;
    
    
    public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee) {
        this.japaneseAdaptee = japaneseAdaptee;
    }


    @Override
    public void send(String word) {
        System.out.println("Reading words ...");
        System.out.println(word);
        String VNword = this.translate(word);
        System.out.println("Sending word ...");
        japaneseAdaptee.receive(VNword);
    }
    private String translate(String VNword){
        System.out.println("Translated!");
        return "konichiwa";
    }

}

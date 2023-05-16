package DesignPatterns.StructuralPatterns.Adapter.Client;

import DesignPatterns.StructuralPatterns.Adapter.Adaptee.JapaneseAdaptee;
import DesignPatterns.StructuralPatterns.Adapter.Adapter.TranslatorAdapter;
import DesignPatterns.StructuralPatterns.Adapter.Target.VietnameseTarget;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget  client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("xin chao");
    }


}

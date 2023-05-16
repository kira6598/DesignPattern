package DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.Client;

import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.ConcreteElement.ProgramingBook;
import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.Element.Book;
import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.ObjectStructure.Customer;
import DesignPatterns.BehavioralPattern.Vistitor.BuyBookPattern.ObjectStructure.Developer;

public class Client {
    public static void main(String[] args) {
        Customer dev = new Developer();
        Book proBook = new ProgramingBook();
        dev.buy(proBook);
    }
}

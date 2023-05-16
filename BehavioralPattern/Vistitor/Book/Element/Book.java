package DesignPatterns.BehavioralPattern.Vistitor.Book.Element;

import DesignPatterns.BehavioralPattern.Vistitor.Book.Visitor.Visitor;

public interface Book {
    void accept(Visitor v);
}

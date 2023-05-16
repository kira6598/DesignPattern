package DesignPatterns.StructuralPatterns.Flyweight.Flyweight;

public class Context {
    private String id;
    private int start;
    public String getId() {
        return id;
    }
    public int getStart() {
        return start;
    }
    public Context(String id, int start) {
        this.id = id;
        this.start = start;
    }

}

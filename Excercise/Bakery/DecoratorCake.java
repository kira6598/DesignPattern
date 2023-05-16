package DesignPatterns.Excercise.Bakery;

public abstract class DecoratorCake implements Cake {
    protected Cake cake;

    protected DecoratorCake(Cake cake) {
        this.cake = cake;
    }

    public abstract String decorate();
}

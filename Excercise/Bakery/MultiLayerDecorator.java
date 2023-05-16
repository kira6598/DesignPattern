package DesignPatterns.Excercise.Bakery;

public class MultiLayerDecorator extends DecoratorCake {
        
    protected MultiLayerDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public int getPrice() {
        int currentPrice= cake.getPrice();
        return currentPrice+5;
    }

    @Override
    public String decorate() {
        return multiDecorate()+cake.decorate();
    }
    private String multiDecorate(){
        return "Multi-Layer ";
    }

    @Override
    public String getName() {
        return cake.getName();
    }
    
}

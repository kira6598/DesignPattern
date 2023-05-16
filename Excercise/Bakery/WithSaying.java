package DesignPatterns.Excercise.Bakery;

public class WithSaying extends DecoratorCake{
  

    protected WithSaying(Cake cake) {
        super(cake);

    }

    @Override
    public String getName() {
       return cake.getName();
    }

    @Override
    public int getPrice() {
        return cake.getPrice();
    }

    @Override
    public String decorate() {
        
        return cake.decorate()+Say();
    }
    public String Say(){
        return "with saying ";
    }
    
}
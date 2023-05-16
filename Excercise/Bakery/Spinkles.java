package DesignPatterns.Excercise.Bakery;

public class Spinkles extends DecoratorCake{

    protected Spinkles(Cake cake) {
        super(cake);
    }

    @Override
    public String getName() {
       return cake.getName();
    }

    @Override
    public int getPrice() {
        return cake.getPrice()+2;
    }

    @Override
    public String decorate() {
        
        return cake.decorate()+spinkles();
    }
    private String spinkles(){
        return "with spinkles ";
    }
    public String MultiTimeDecorate(int times){
        String results = "" ;
        while(times>0){
            results+=spinkles();
            times--;
        }
        return results;
    }
}

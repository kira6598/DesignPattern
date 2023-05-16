package DesignPatterns.Excercise.Bakery;

public class ChocolateCake extends AbstractCake {

    @Override
    public String decorate() {
        return "";
    }

    @Override
    public void setName() {
        this.name=CakeTypes.CHOCOLATE.toString()+" cake";   
    }

    @Override
    public void setPrice(){
        this.price=5;
    }


    
}

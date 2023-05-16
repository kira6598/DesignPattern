package DesignPatterns.Excercise.Bakery;

public class VanillaCake extends AbstractCake {


    @Override
    public void setPrice(){
        this.price=10;
    }
    @Override
    public void setName() {
        this.name=CakeTypes.VANILLA.toString()+" cake";        
    }
    @Override
    public String decorate() {
        return"";
    }

}

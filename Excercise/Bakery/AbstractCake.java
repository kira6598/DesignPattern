package DesignPatterns.Excercise.Bakery;

public abstract class AbstractCake implements Cake {
    public AbstractCake(){
        setName();
        setPrice();
    }
    String name;
    int price;
    @Override
    public String getName() {
        return name;
    }
    public abstract void setName();
    @Override
    public int getPrice() {
        return price;
    }

    public abstract void setPrice();

}

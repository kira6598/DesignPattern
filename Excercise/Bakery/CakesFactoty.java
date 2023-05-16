package DesignPatterns.Excercise.Bakery;

public class CakesFactoty {
    private CakesFactoty(){}
    public static Cake getCake (CakeTypes cakeType){
        switch (cakeType){
            case VANILLA :return new VanillaCake();
            case CHOCOLATE :return new ChocolateCake();
            
            default: throw new UnsupportedOperationException("we cannot make cake with that types");
        } 
    }
    public static Cake getCakeByInt (int chose){
        switch (chose){
            case 1 :return new VanillaCake();
            case 2 :return new ChocolateCake();
            
            default: throw new UnsupportedOperationException("we cannot make cake with that types");
        } 
    }
}

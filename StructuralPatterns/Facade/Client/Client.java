package DesignPatterns.StructuralPatterns.Facade.Client;

import DesignPatterns.StructuralPatterns.Facade.Facade.ShopFacade;

public class Client {
    public static void main(String[] args) {
        ShopFacade.getIntance().buyProductByCashWithFreeShipping("sonpham@");
        ShopFacade.getIntance().buyProductByPaypalWithStandardShipping("sonpham@", "0975418130");
    }
}

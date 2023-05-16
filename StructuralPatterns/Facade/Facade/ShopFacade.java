package DesignPatterns.StructuralPatterns.Facade.Facade;

import DesignPatterns.StructuralPatterns.Facade.Subsystems.AccountService;
import DesignPatterns.StructuralPatterns.Facade.Subsystems.EmailService;
import DesignPatterns.StructuralPatterns.Facade.Subsystems.PaymentService;
import DesignPatterns.StructuralPatterns.Facade.Subsystems.ShippingService;
import DesignPatterns.StructuralPatterns.Facade.Subsystems.SmsService;

public class ShopFacade {


    private  AccountService accountService;
    private  EmailService emailService;
    private  PaymentService paymentService;
    private  ShippingService shippingService;
    private  SmsService smsService;
    private  final static ShopFacade instance = new ShopFacade();
   private ShopFacade() {
    accountService = new AccountService() ;
    emailService = new EmailService();
    paymentService =new PaymentService() ;
    shippingService =new ShippingService() ;
    smsService =new SmsService();
}


    public static ShopFacade getIntance(){
        return instance;
    }

    public void buyProductByCashWithFreeShipping(String email){
        accountService.getAccount(email);
        paymentService.paymentByCash();
        shippingService.freeShipping();
        emailService.sendMail(email);

        System.out.println("Done \n");
    }

    public void buyProductByPaypalWithStandardShipping(String email, String mobilePhone) {
        accountService.getAccount(email);
        paymentService.paymentByPaypal();
        shippingService.standardShipping();
        emailService.sendMail(email);
        smsService.sendSMS(mobilePhone);
        System.out.println("Done\n");
    }

}

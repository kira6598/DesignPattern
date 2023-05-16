package DesignPatterns.BehavioralPattern.Observer.Client;

import DesignPatterns.BehavioralPattern.Observer.ConcreteObserver.Logger;
import DesignPatterns.BehavioralPattern.Observer.ConcreteObserver.Mailer;
import DesignPatterns.BehavioralPattern.Observer.ConcreteObserver.Protector;
import DesignPatterns.BehavioralPattern.Observer.ConcreteSubject.AccountService;
import DesignPatterns.BehavioralPattern.Observer.User.Login_Status;
import DesignPatterns.BehavioralPattern.Observer.observer.Observer;

public class Cllient {
    public static void main(String[] args) {
        Observer logger = new Logger();
        Observer mailer = new Mailer();
        Observer protector= new Protector();
        AccountService accountService = new AccountService("sonphsam", "127.0.0.0");
        accountService.attach(logger);
        accountService.attach(mailer);
        accountService.attach(protector);

        accountService.login();
        accountService.changeStatus(Login_Status.EXPIRED);


    }
}

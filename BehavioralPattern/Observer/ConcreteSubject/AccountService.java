package DesignPatterns.BehavioralPattern.Observer.ConcreteSubject;

import java.util.ArrayList;
import java.util.List;
import DesignPatterns.BehavioralPattern.Observer.Subject.Subject;
import DesignPatterns.BehavioralPattern.Observer.User.Login_Status;
import DesignPatterns.BehavioralPattern.Observer.User.User;
import DesignPatterns.BehavioralPattern.Observer.observer.Observer;

public class AccountService implements Subject {

    private User user;
    private List<Observer> observers= new ArrayList<>();
    
    public AccountService(String emai,String ip){
        user= new User();
        user.setIp(ip);
        user.setEmail(emai);
    }

    @Override
    public void attach(Observer observer) {
      if(!observers.contains(observer)){
        observers.add(observer);
      }
    }

    @Override
    public void detach(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
          }
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(user);
        }
    }
    public void changeStatus(Login_Status status){
        user.setStatus(status);
        System.out.println("status is changed!!!");
        this.notifyAllObserver();
    }
    public void login(){
        if(!this.isValidIp()){
            user.setStatus(Login_Status.INVALID);
        }else if(this.isValidEmail()){
            user.setStatus(Login_Status.SUCCESS);
        }else{
            user.setStatus(Login_Status.FAILURE);
        }
        System.out.println("Login handled");
        this.notifyAllObserver();
    }
    private boolean isValidIp(){
        return "127.0.0.1".equals(user.getIp());
    }
    private boolean isValidEmail(){
        return "sonpham".equals(user.getEmail());
    }
}

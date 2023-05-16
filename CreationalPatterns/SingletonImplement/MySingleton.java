package DesignPatterns.CreationalPatterns.SingletonImplement;
/*
    ## sử dụng khi:
    - muốn chỉ có một instance được tạo
    - vì có 1 instance nên quản lý truy cập tốt hơn

    ## Nguyên tắc:
    - private contructor: hạn chế truy cập từ class bên ngoài
    - private static final variable: biến chỉ được khởi tạo trong class
    - 1 public static method để return instance

*/ 

public class MySingleton {
    public static void main(String[] args) {
        EagerInitializedSingleton eagerInitializedSingleton= EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInitializedSingleton1= EagerInitializedSingleton.getInstance();

        System.out.println(eagerInitializedSingleton);
        System.out.println(eagerInitializedSingleton1);
    }
}

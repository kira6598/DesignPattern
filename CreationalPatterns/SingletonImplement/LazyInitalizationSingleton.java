package DesignPatterns.CreationalPatterns.SingletonImplement;
// hoạt động tốt trong môi trường đơn luồng (good work in single-thread environment)
public class LazyInitalizationSingleton {
    private static LazyInitalizationSingleton instance;
    private LazyInitalizationSingleton(){};
    public static LazyInitalizationSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitalizationSingleton();

        }
        return instance;
    }
}

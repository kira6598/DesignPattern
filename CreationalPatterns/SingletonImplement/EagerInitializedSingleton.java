package DesignPatterns.CreationalPatterns.SingletonImplement;
// dễ bị phá vỡ bởi reflextion
public class EagerInitializedSingleton  {
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
    // private contructor to avoid client applications to use default contructor
    private EagerInitializedSingleton(){}
    public static EagerInitializedSingleton getInstance(){
        return INSTANCE;
    }
}

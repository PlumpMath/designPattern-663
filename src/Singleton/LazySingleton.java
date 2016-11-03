package Singleton;

/**
 * Created by jht on 2016/10/17.
 */
public class LazySingleton extends Singleton{
    private static LazySingleton uniqueInstance;

    private LazySingleton(){};
    public static Singleton getSingleton() {
        if(uniqueInstance==null){
            uniqueInstance = new LazySingleton();
            return uniqueInstance;
        }
        return uniqueInstance;
    }
}

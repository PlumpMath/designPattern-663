package Singleton;

/**
 * Created by jht on 2016/10/17.
 */
public class EagerSingleton extends Singleton{
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton(){};

    public static Singleton getSingleton() {
        return uniqueInstance;
    }
}

package Singleton;

/**
 * Created by jht on 2016/10/17.
 */
public class SingletonTest {
    public static void main(String[] args){
        Singleton es = EagerSingleton.getSingleton();
        System.out.println("修改前EagerSingleton的测试属性值为："+es.i);
        es.i = 5;
        es = null;
        es = EagerSingleton.getSingleton();
        System.out.println("修改后EagerSingleton的测试属性值为："+es.i);
        Singleton ls = LazySingleton.getSingleton();
        System.out.println("修改前LazySingleton的测试属性值为："+ls.i);
        ls.i = 6;
        ls = null;
        ls = LazySingleton.getSingleton();
        System.out.println("修改后LazySingleton的测试属性值为："+ls.i);


    }
}

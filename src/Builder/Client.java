package Builder;

/**
 * Created by jht on 2016/10/27.
 */
public class Client {
    public static void main(String[] args){
        Director d = new Director(3);
        Builder b = new ConcreteBuilder();
        d.MakeBTree(b);
    }
}

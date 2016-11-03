package Builder_Composite;

import java.util.Scanner;

/**
 * Created by jht on 2016/11/2.
 */
public class Client {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int depth = scanner.nextInt();
        Director d = new Director(depth);
        Builder b = new ConcreteBuilder();
        d.MakeBTree(b);
    }
}

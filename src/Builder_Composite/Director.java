package Builder_Composite;

/**
 * Created by jht on 2016/11/2.
 */
public class Director {
    int n;
    public Director(int number){
        n = number;
    }
    public void MakeBTree(Builder builder){
        builder.MakeBTree(n);
    }
}

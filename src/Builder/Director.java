package Builder;

/**
 * Created by jht on 2016/10/26.
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

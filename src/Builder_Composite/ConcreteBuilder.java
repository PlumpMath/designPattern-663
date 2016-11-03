package Builder_Composite;

/**
 * Created by jht on 2016/11/2.
 */
public class ConcreteBuilder implements Builder{
    @Override
    public void MakeBTree(int number) {
        Node root = new Node(number,0,"Level_1","Root");
        root.Display();
    }

    @Override
    public void Display() {

    }
}

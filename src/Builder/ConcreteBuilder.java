package Builder;

/**
 * Created by jht on 2016/10/26.
 */
public class ConcreteBuilder implements Builder {
    Product p=new Product();
    int level = 1;
    @Override
    public void MakeBTree(int number) {
        print("Level_1",1,number);

    }
    // need parent nodeString, the last letter of parent string
    private void print(String val, int i, int n) {
        if (i < Math.pow(2, n)) {
            if (level > 1)
                val = val + "_" + (i % 2 == 0 ? 1 : 2);
            System.out.println(val);
            val = val.replace("Level_" + level, "Level_" + (level + 1));
            level++;
            String baseVal = val.trim();
            val = this.p.getMenuStr(val.length()) + baseVal;
            print(val, 2 * i, n);
            print(val, 2 * i + 1, n);
            level--;
        }

    }
}

package Builder;

/**
 * Created by jht on 2016/10/26.
 */
public class Product {

    protected String getMenuStr(int n) {
        String spaces = "";
        for (int i = 0; i < n; i++)
            spaces += " ";
        return spaces;
    }
}

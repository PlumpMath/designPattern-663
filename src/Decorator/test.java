package Decorator;

/**
 * Created by jht on 2016/10/18.
 */
public class test {
    public static void main(String[] args){
        shoppinglist s;
        Product p = new Product();
        p = new subProduct1(p,2);
        //System.out.println(p.getdescription());
        p = new subProduct2(p,2);
        s = new shopping_receipt(p);
        s.printShoppinglist();
    }
}

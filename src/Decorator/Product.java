
package Decorator;

/**
 * Created by jht on 2016/10/18.
 */
public class Product extends shoppinglist {

    protected int unit;
    protected float price;
    protected String description = "";


    @Override
    public float cost() {
        return price;
    }

    public String getdescription() {
        return description;
    }

    @Override
    public void printShoppinglist() {
    }
}
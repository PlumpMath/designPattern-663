package Decorator;

/**
 * Created by jht on 2016/10/18.
 */
public class subProduct2 extends Product {
    private Product p ;
    public subProduct2(Product p, int n){
        price = 5.56f;
        unit = n;
        this.p = p;
        description = "subProduct2 * "+unit+"     "+price*unit+"元";
        description = p.description + "\n" + this.description;

    }

    @Override
    public float cost() {
        return price*unit+p.price*p.unit;
    }

    @Override
    public String getdescription() {
        return this.description;
    }
}

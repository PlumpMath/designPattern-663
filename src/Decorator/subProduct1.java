package Decorator;

/**
 * Created by jht on 2016/10/18.
 */
public class subProduct1 extends Product {
    private Product p ;
    public subProduct1(Product p, int n){
        price = 2.13f;
        unit = n;
        this.p = p;
        description = "subProduct1 * "+unit+"     "+price*unit+"元";
        description = p.description + "\n" + this.description;

    }

    @Override
    public float cost() {
        return price*unit+p.price*p.unit;
    }

    @Override
    public String getdescription() {
        return description;
    }
}

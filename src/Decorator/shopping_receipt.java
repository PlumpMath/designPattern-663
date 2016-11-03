package Decorator;

/**
 * Created by jht on 2016/10/27.
 */
public class shopping_receipt extends shoppinglist{
    private Product p;
    private String description1;
    public shopping_receipt(Product p){
        this.p = p;
        this.description1 = "-----东北大学超市购物小票-------\n";

    }

    @Override
    public float cost() {
        return p.cost();
    }

    @Override
    public String getdescription() {
        return description1+p.getdescription();
    }
    @Override
    public void printShoppinglist(){
        System.out.println(this.getdescription());
        System.out.println("合计（人民币）      "+cost()+"元\n*****************\n"+"14天购物保证。\n货真价实\n" +
                "东大超市电话83688888\n******************");
    }
}

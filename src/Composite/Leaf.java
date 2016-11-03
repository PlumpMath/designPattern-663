package Composite;

/**
 * Created by jht on 2016/10/19.
 */
class Leaf extends Component {
    private String name = "";
    private int count = 0;
    public Leaf(int depth,int count,String name,String d){
        this.name  = name;
        this.count = count;
        String[] s = this.name.split("_");
        this.name = this.name.replaceFirst(s[1],String.valueOf(count+1));
        if (d.equals("l")){
            this.name += "_1";
            this.name = "     "+this.name;
        }
        if (d.equals("r")){
            this.name += "_2";
            this.name = "     "+this.name;
        }
    }
    @Override
    public void Display() {
        System.out.println(this.name);
    }
}

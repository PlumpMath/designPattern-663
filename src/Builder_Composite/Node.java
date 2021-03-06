package Builder_Composite;

/**
 * Created by jht on 2016/11/2.
 */
public class Node extends Root{
    private Root lchild;
    private Root rchild;
    private String name = "";
    private int count = 1;
    public Node(int depth,int count,String name,String d){
        this.name  = name;
        this.count = count+1;
        String[] s = this.name.split("_");
        String ss = String.valueOf(this.count);
        this.name = this.name.replaceFirst(s[1],ss);
        if (d.equals("l")){
            this.name += "_1";
            this.name = "     "+this.name;
        }
        if (d.equals("r")){
            this.name += "_2";
            this.name = "     "+this.name;
        }

        if(depth>2){
            this.lchild = new Node(depth-1,this.count,this.name,"l");
            this.rchild = new Node(depth-1,this.count,this.name,"r");
        }
        if(depth==2){
            this.lchild = new Leaf(depth-1,this.count,this.name,"l");
            this.rchild = new Leaf(depth-1,this.count,this.name,"r");
        }


    }

    @Override
    public void Display() {
        System.out.println(this.name);
        if (lchild!=null&&rchild!=null){
            lchild.Display();
            rchild.Display();
        }

    }
}

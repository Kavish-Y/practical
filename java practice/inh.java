class base{
    public int a=3;
    public int b=3;
}
class derive extends base{
    // public int c=a+b;
    public void add(){
        System.out.println(+a+b);
    }
}
public class inh{
    public static void main(String[]args){
        derive d1=new derive();
        d1.add();
    }
}


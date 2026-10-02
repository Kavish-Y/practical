class base {
    public int a=2;
    public int b=2;
}
class derive extends base{
    public int c=12;
}
class derive2 extends derive{
    public int d;
    void add(){
        d=a+b+c;
        System.out.println(d);
    }
}

public class mult{
public static void main(String[]args){
    derive2 d1=new derive2();
    d1.add();
}
}

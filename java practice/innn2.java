class base{
    public void fun(){
        System.out.println("i am base class");
    }
}
class derive extends base{
    public void fun(){
        System.out.println("i am derive class");
    }
}
public class innn2{
    public static void main(String[]args){
        derive d1=new derive();
        d1.fun();
        base b1=new base();
        b1.fun();
    }
}

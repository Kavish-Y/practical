package pack;
class add{
    public int a=2;
    public int b=2;
    public void add1(){
        int c;
        c=a+b;
        System.out.println("sum="+c);
    }
}
class sub extends add{
    public void sub1(){
        int d;
        d=a-b;
        System.out.println("sub="+d);
    }
}
class div extends add{
    public void division(){
        int e;
        e=a/b;
        System.out.println("division=");
    }
}
public class pack{
    public static void main(String[] args) {
        add a1=new add();
        a1.add1();
        sub s1=new sub();
        s1.sub1();
        div d1=new div();
        d1.division();
    }
}

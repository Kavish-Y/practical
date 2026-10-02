class cons {
    cons(){
        int a = 5;
        int b = 4;
        int c;
        c=a+b;
        System.out.println("sum=");
        System.out.println(c);
    }
    cons(int c){
        int d=4;
        int e;
        e=c-d;
        System.out.println("sub=");
        System.out.println(e);

    }
}   
public class consover{
    public static void main(String[]args){
        cons c1=new cons();
        cons c2=new cons(5);
    }
}

public class new2{
    static int change(int a){
        int z;
        z=a*a;
        return z;
    }
    static int change(int a,int b){
        int x;
        x=a*b;
        return x;
    } 

public static void main(String[]args){
    int a=5;
    int b=10;
    int c=change(a);
    System.out.println(c);
    int d=change(a,b);
    System.out.println(d);
}
}


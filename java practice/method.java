import java.util.Scanner;

public class method{
    static int nee(int a,int b){
        if(a>b){
            int z;
            z = a+b;
            return z;
        }
        else{
            System.err.println("nothing");
            return 0;
        }
    }
    public static void main(String[]args){
        int a=10;
        int b=5;
        int c=nee(a,b);
        System.out.println(c);
    }
}
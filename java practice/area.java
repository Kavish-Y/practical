import java.util.Scanner;
class rectangle{
    int a=12;
    int b=12;
    void ar(){
        int c;
        c = a*b;
        System.out.println("area of rectangle is");
        System.out.println(c);
    } 
}
class cuboid extends rectangle{
    void arr(){
        int d;
        d = a*a*a;
        System.out.println("area of cuboid is");
        System.out.println(d);
    }
}
public class area{
    public static void main(String[]args){
        cuboid c1=new cuboid();
        c1.ar();
        c1.arr();
    }             
}
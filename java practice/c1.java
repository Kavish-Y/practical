import java.util.Scanner;
public class c1{
    public static void main(String[]args){
        System.out.println("salery");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if (a<250000) {
            System.out.println("no tax paid");
        }
        else if (a>=250000 && a<500000) {
            int b=a/100;
            int c=b*5;
            System.out.println("5% tax must be paid");
            System.out.println(c);
        }
        else if (a>=500000 && a<1000000){
            int b=a/100;
            int c=b*15;
            System.out.println("15% tax must be paid");
            System.out.println(c);
        }
        else{
             int b=a/100;
             int c=b*20;
            System.out.println("20% tax must be paid");
            System.out.println(c);
        }
    }
}
import java.util.Scanner;

public class tabel {
    public static void main(String[]args){
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            // System.out.print("2*");
            // System.out.print(i);
            // System.out.print("2*");
            // System.out.print(i);
            int a=2*i;
            System.out.println(a);
        }
    }
    
}
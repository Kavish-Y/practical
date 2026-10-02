import java.util.Scanner;
public class right {

    public static void main(String[]args){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int k=1;
        for(i=1;i<=n;i++){
            k=k*i;
        }
         System.out.println(k);
    }
}
import java.util.Scanner;
public class tabedw {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int k;
        do {
            k=n*i;
            System.out.println(k);
            i++;
        }
         while (i<=10);

    }
}

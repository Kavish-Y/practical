import java.util.Scanner;
public class tabelw {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int k;
        while (i<=10) {
            k=n*i;
            System.out.println(k);
            i++;
        }

    }
}

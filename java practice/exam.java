import java.util.Scanner;
public class exam{
    public static void main(String[]args){
        System.out.println("enter physics chemistry maths marks");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d = a/3+b/3+c/3;
        if (a>33 && b>33 && c>33 && d>40 ) {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
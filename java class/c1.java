import java.util.Scanner;
public class c1{
public static void main(String[]args){
	System.out.println("input from user");
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c;
	c=(a/2)+(b/2);
	System.out.println(c);
    int d,e;
	d=(a*a)+(b*b);
	System.out.println(d);
	e=(a*a)+(b*b)+2*a*b;
	System.out.println(e);
}
}

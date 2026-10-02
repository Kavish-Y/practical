import java.util.Scanner;
public class arrch{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr=new int[5];
System.out.println("enter the 5 marks");
for(int i=0;i<5;i++){
System.out.println("arr["+i+"]:");
arr[i]=sc.nextInt();
}
for(int i=0;i<5;i++){
System.out.println("arr["+i+"]:"+arr[i]);
}
int index;
System.out.println("index:");
index = sc.nextInt();
if(index>=0 || index<=4){
    System.out.println("arr is "+arr);
}
}
}

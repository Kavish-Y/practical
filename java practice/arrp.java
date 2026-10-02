import java.util.Scanner;
class one{
    // public int n;
    public int[]arr = new int[4];
    void putdata(){
    Scanner sc=new Scanner(System.in);
    // System.out.println("enter the number of element");
    for(int i=0; i<4; i++){
        System.out.println("enter the number for"+i);
        arr[i] = sc.nextInt();
    }
    }
    void showdata(){
        for(int i=0; i<4; i++){
            System.out.println("the entered elements are "+arr[i]);
        }
    }
}
public class arrp{
    public static void main(String[]args){
        one o1=new one();
        one o2=new one();
        o1.putdata();
        o1.showdata();

    }
}
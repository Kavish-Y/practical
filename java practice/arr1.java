import java.util.Scanner;
public class arr1 {
    
    public static void main(String[]args){
        System.err.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]num={1,2,3,4,5};
        int i;
       for(i=0;i<5;i++){
        if(num[i]==n){
            System.out.println("Found");
            return;
           
        }
        else{
            System.out.println("Not Found");
           
        }
       
       }
    }

}
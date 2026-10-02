import java.util.Scanner;
public class physics {
    static public void main(String[]args){
        int[]marks={40,50,60,70};
        int i,k;
        int sum=0;
        for(i=0;i<=3;i++){

            sum=sum+marks[i];
        }
        k=sum/4;
        System.err.println("Average=");
        System.err.print(k);
    }
}

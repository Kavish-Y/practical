import java.util.Scanner;
public class add {
    static public void main(){
        int[][]max1=new int[2][3];
        int[][]max2=new int[2][3];
        int[][]add=new int [2][3];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of first matrix:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                max1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the element of second matrix");

        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                max2[i][j] = sc.nextInt();
            }
        }
        for (i=0; i<2; i++) {
            for (j = 0; j<3; j++) {
                add[i][j] = max1[i][j] + max2[i][j];
            }
        }
         System.out.println("Sum of the matrices:");
        for (i=0; i<2; i++) {
            for (j=0; j<3; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
    }
}

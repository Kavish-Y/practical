class add{
    public int arr1;
    public int[][]a={
        {1,2},
        {1,2}
    };
    public int[][]b={
        {1,2},
        {1,2}
    };
    public void add(){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int[][] add1=new int[2][2];
                add1[i][j] = a[i][j] + b[i][j];
                System.out.println(add1[i][j]);
            }
            System.out.println();
        }
    }
}
public class arr{
    public static void main(String[] args) {
        add a1=new add();
        a1.add();
    }
}
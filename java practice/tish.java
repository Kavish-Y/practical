class thi{
    int a,b;
    public void setA(int a){
        this.a= a;
    }
    public void setB(int b){
        this.b= b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
}

class new1 extends thi{
    public int d;
    public int add(){
        return getA() + getB();
        
    }
}
public class tish{
    public static void main(String[]args){
        new1 n1=new new1();
        n1.setA(15);
        n1.setB(12);
        int e=n1.add();
        System.out.println("sum is");
        System.out.println(e);
    }
}

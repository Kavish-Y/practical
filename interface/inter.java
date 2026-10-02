class base{
    private int a,b;
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
}
class derived extends base{
    public int area(){
        return getA()*getB();
    }
    public int volume(){
        return getA()*getA()*getA();
    }
}
public class inter{
    public static void main(String[] args) {
        derived d1=new derived();
        d1.setA(12);
        d1.setB(12);
        int d=d1.area();
        System.out.println("the area");
        System.out.println(d);
        int e=d1.volume();
        System.out.println("the volume ");
        System.out.println(e);
    }
}

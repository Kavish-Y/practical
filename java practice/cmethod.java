class base{
    private int a,b;
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

class derive extends base{
   public int area() {
        return getA() * getB();
   }
   public int volume(){
    return getA()*getA()*getA();
   }
}
// hidden and private variable ki value ko set ya modify karna ka kamm ata ha
public class cmethod{
    public static void main(String[]args){
        derive d1=new derive();
        d1.setA(12);
        d1.setB(12);
        int d=d1.area();
        System.out.println("area of square");
        System.out.println(d);
        int e=d1.volume();
        System.out.println("volume of cuboid");
        System.out.println(e);
    }
}

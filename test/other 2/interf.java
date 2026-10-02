interface A{
    public void show();
    public void show1();
}
interface B{
    public void display();
    public void display1();
}
class base implements A,B{
    public void show(){
        System.out.println("this is show in class 1");
    }
    public void show1(){
        System.out.println("this is show1 in class 1");
    }
    public void display(){
        System.out.println("");
    }
    public void display1(){
        System.out.println("2 display");
    }
}
public class interf{
    public static void main(String[] args) {
        base b1=new base();
        b1.show();
        b1.show1();
        b1.display();
        b1.display1();
    }
}

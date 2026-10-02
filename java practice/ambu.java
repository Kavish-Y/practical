interface A{
    void show();
    void display();
}
interface B{
    void show2();
    void display();
}
class one implements A,B{
    public void display(){
        System.out.println("display");
    }
    public void show(){
        System.out.println("this is show");
    }
    public void show2(){
        System.out.println("this is show2 ");
    }
}
class two extends one implements A,B{
    public void display(){
        System.out.println("display of 2 class");
    }
    public void show(){
        System.out.println("this is show");
    }
    public void show2(){
        System.out.println("this is show2 ");
    }
}
public class ambu{
    public static void main(String[] args) {
        two S1=new two();
        S1.display();
        S1.show();
        S1.show2();
    }
}

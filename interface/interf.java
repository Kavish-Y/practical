interface A{
    void display();
    void show();
}
interface B{
    void display();
    void show2();
}
class chittha implements A,B{
    public void display(){
        System.out.println("this is display of class 1");
    }
    public void show(){
        System.out.println("this is the show of class 1");
    }
    public void show2(){
        System.out.println("this is the show 2 of first class");
    }
}
public class interf{
    public static void main(String[] args) {
        chittha c1=new chittha();
        c1.display();
        c1.show();
        c1.show2();
    }
}
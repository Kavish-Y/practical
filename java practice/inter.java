// this is a interface programme
interface A{

    public void show(); 
    // this is also public and abstract
    abstract public void name();
    // this is also public and abstract
}
interface B{
    public void new1();
    public void new2();

}
class enter1 implements A,B{
    public void show(){ 
        System.out.println("show");
    }
    public void name(){
        System.out.println("kavish");
    }
    public void new1(){
        System.out.println("this one is new");
    }
    public void new2(){
        System.out.println("this us the secon new class");
    }
}
public class inter{
    public static void main(String[] args) {
        enter1 e1=new enter1();
        e1.show();
        e1.name();
        e1.new1();
        e1.new2();
    }
} 


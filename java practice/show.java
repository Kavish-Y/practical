abstract class parent{
    parent(){
        System.out.println("iam parent");
    }
    public void hello(){
        System.out.println("he");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child extends parent{
    public void greet(){
        System.out.println("i am abstract in parent and normal in child");
    }
    public void greet2(){
        System.out.println("same here");
    }
}
abstract class child2 extends parent{
    public void friend(){
        System.out.println("hi friends");
    }
}
public class show{
    public static void main(String[] args) {
        child c1=new child();
        c1.greet();
        c1.greet2();
    }
}
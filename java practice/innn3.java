class phone{
    public void name(){
        System.out.println("this is phone class");
    }
    public void greet(){
        System.out.println("gm");
    }
}
class smart extends phone{
    public void name(){
        System.out.println("this is derive class");
    }
    public void swagat(){
        System.out.println("apaka swagat ha");
    }
}
public class innn3{
    public static void main(String[] args) {
        phone p1=new smart();
        p1.name();
    }
}
// dynamic method display

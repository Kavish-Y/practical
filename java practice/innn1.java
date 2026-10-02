class base{
    public int a;
     public void name(){
        System.out.println("helooooooo");
     }
}
class derive extends base{
    public void name(int a){
        System.out.println("HOW");
    }
}
public class innn1{
    public static void main(String[]args){
        derive d1=new derive();
        d1.name(12);
        d1.name();
    }
}


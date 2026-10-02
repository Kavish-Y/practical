class base{
    base(){
        System.out.println("i am base class");
    }
    base(int a){
        System.out.println(a);
    }
}
// purvaj ko phala ijjat data ha 
class derive extends base{
    derive(){
        super(5);
        System.out.println("i am derive class");
    }
    derive(int b){
       System.out.println(b);
    }
}
class derive1 extends derive{
    derive1(){
        super(13)
    }
}
public class bas{
    public static void main(String[]args){
        // base b1=new base();
        derive d1=new derive();
    }
}
    


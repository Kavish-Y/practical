import java.util.*;
class string{
    public String name="array";
    public void show(){
    
    System.out.println(name);
    }
    public void show1(){
    name.replace('a','r');
    System.out.println(name.replace('a', 'r'));
    }
}
public class str{
    public static void main(String[] args) {
        string s1=new string();
        s1.show();
        s1.show1();
    }
}
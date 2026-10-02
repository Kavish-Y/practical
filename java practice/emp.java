class info{
    int id;
    String name;
    public void printdetails(){
        System.out.println("my id is "+id); //+ is added due to syntex
        System.out.println("my name is"+name);
    }
}
public class emp{
    public static void main(String[]args){
        System.out.println("this is our main class");
        info i1 = new info();
        i1.id = 12;
        i1.name = "kavish";
        i1.printdetails();
    }
}

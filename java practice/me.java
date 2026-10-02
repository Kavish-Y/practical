 class A {
    // public void details(String[]args){
        
        private int id;
        private String name;
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
}
    public class me{
        public static void main(String[]args){
            A a1=new A();
            a1.setname("hey");
            System.out.println(a1.getname());
        }
    }


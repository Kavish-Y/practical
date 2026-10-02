class MyThread1 implements Runnable{
    public void run(){
        int i=0;
        while (i<=10){
            System.out.println("running my thread1");
            System.out.println("my thread 1 extends from thread");
            i++;
        }
    
    }
}
class MyThread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<=10){
            System.out.println("running my thread2");
            System.out.println("my thread 2 extends from thread");
            i++;
        } 
    }
}
public class thread2{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        Thread g1= new Thread(t1);
        MyThread2 t2 = new MyThread2();
        Thread g2= new Thread(t2);
        g1.start();
        g2.start();
    }
}
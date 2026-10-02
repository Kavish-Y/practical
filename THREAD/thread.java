class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while (i<=10){
            System.out.println("running my thread1");
            System.out.println("my thread 1 extends from thread");
            i++;
        }
    
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<=10){
            System.out.println("running my thread2");
            System.out.println("my thread 2 extends from thread");
            i++;
        } 
    }
}
public class thread{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
package speedmaster.gold;

public class G8_02_Thread {
    public static void main(String[] args) {
        Runnable r=()->System.out.print(Thread.currentThread().getName());
        try {
            Thread t1=new Thread(r,"t1 ");
            t1.start();
            Thread.sleep(1000);
            Thread t2=new Thread(r,"t2 ");
            t2.start();
            Thread.sleep(1000);
            System.out.println("Finish ");
        } catch (InterruptedException e) {}
    }
}
/*
t1 t2 Finish 
*/
package speedmaster.gold;

/**
 * G8_1_
 */
public class G8_01_Thread {
    public static void main(String[] args) {
        Runnable r1=()->System.out.print(Thread.currentThread().getName());
        Runnable r2=()->System.out.print(Thread.currentThread().getName());
        new Thread(r1,"Thread1 ").start();
        new Thread(r2,"Thread2 ").start();
    }
}
/*
Thread1 Thread2 
*/
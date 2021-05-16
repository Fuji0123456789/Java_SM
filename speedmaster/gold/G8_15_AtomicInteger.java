package speedmaster.gold;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * G8_15_
 */
public class G8_15_AtomicInteger {
    public static void main(String[] args) {
        ArrayList<AtomicInteger> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new AtomicInteger());
        }
        for (int i = 0; i < list.size(); i++) {
            AtomicInteger value=list.get(i);
            value.incrementAndGet();
            if ((i%2)==0) {
                value.compareAndSet(1, 5);
            }
            System.out.print(value+" ");
        }
    }
}
/*
5 1 5 1 5
*/
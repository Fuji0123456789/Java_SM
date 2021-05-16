package speedmaster.gold;

import java.lang.NullPointerException;
public class G3_01_try_catch_finally {

    public static void main(String[] args) {
        G3_01_try_catch_finally test = new G3_01_try_catch_finally();
        test.func();
    }

    public void func() {
        System.out.print("start ");
        String s=null;
        try {
            int i=s.length();
            System.out.print("try ");
        } catch (NullPointerException e) {
            //TODO: handle exception
            System.out.print("catch ");
            throw e;
        } finally {
            System.out.print("finally ");
        }
        System.out.print("end ");
    }
}
/*
start catch finally Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
        at gold.G3_1_try_catch_finally.func(G3_1_try_catch_finally.java:17)
        at gold.G3_1_try_catch_finally.main(G3_1_try_catch_finally.java:10)
*/
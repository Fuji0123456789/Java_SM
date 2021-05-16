package speedmaster.gold;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * G3_1_try_catch_finally
 */
public class G3_02_try_catch {

    static void func() throws FileNotFoundException{
        try {
            throw new FileNotFoundException();
        } finally {
            System.out.print("end1 ");
        }
    }
    public static void main(String[] args) {
        try {
            func();
        } catch (IOException e) {
            System.out.print("EX1 ");
        /*
        } catch (FileNotFoundException e) {//Unreachable catch block for FileNotFoundException. It is already handled by the catch block for IOExceptionJava(553648315)
            System.out.print("EX2 ");
        */
        } finally {
            System.out.print("end2 ");
        }
    }
}

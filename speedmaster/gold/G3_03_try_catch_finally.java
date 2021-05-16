package speedmaster.gold;

/**
 * G3_1_try_catch_finally
 */
public class G3_03_try_catch_finally {

    public static void main(String[] args) {
        try {
            String[] str=new String[3];
            func(str);
            System.out.print("try ");
        } catch (NullPointerException e) {
            System.out.print("catch ");
        }
        System.out.print("finish");
    }
    static void func(String[] str) throws RuntimeException{
        for(int i=0;i<str.length;i++){
            System.out.print(str[i].toString()+" ");
        }
    }
}
/*
catch finish
*/
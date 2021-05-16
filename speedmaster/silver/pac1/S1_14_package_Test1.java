package speedmaster.silver.pac1;

//import speedmaster.silver.pac1.*;
//import speedmaster.silver.pac1.pac2.*;
import speedmaster.silver.pac1.pac2.S1_14_package_Test2;

/**
 * S1_4_main
 */
public class S1_14_package_Test1 {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(str);
        S1_14_package_Test2 test2 = new S1_14_package_Test2();
        //speedmaster.silver.pac1.pac2.S1_14_package_Test2 test2 = new speedmaster.silver.pac1.pac2.S1_14_package_Test2();
        test2.foo();
    }
}
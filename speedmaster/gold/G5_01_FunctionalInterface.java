package speedmaster.gold;

@FunctionalInterface
/**
 * G5_1_
 */
interface G5_01_FunctionalInterface {
    //Invalid '@FunctionalInterface' annotation; G5_1_FunctionalInterface is not a functional interfaceJava(553648792)
    /*
    public String toString();
    */
    public void func();

    //Invalid '@FunctionalInterface' annotation; G5_1_FunctionalInterface is not a functional interfaceJava(553648792)
    /*
    public default void func(){}
    */

    /*
    public static void test() {}
    public void func();
    */
}
package speedmaster.gold;

interface G5_02_FunctionalInterface {
    public static int func(int i){
        return i*i;
    }
}
interface Test2G5_2 {
    public default double func(int j){
        return j*1.0;
    }
    public boolean equals(Object object);
}
interface Test3 {
    public String toString();
    public int func();    
}
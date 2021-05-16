package speedmaster.gold;

class CustomerG4_1<T>{
    private T id;
    public void setId(T id) {
        this.id=id;
    }
    public T getId() {
        return id;
    }
}

/**
 * G4_1_
 */
public class G4_01_generic{
    public static void main(String[] args) {
        CustomerG4_1<Integer> c1=new CustomerG4_1<>();
        //CustomerG4_1 is a raw type. References to generic type CustomerG4_1<T> should be parameterizedJava(16777788)
        //CustomerG4_1 c2=new CustomerG4_1();
        CustomerG4_1<String> c2=new CustomerG4_1<>();
        c1.setId(500);
        //Type safety: The method setId(Object) belongs to the raw type CustomerG4_1. References to generic type CustomerG4_1<T> should be parameterizedJava(16777747)
        c2.setId("505");
        Integer num=c1.getId();
        //Type mismatch: cannot convert from Object to StringJava(16777233)
        String str=c2.getId();
        System.out.println(num+" : "+str);
    }
}

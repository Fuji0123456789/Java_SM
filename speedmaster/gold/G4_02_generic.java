package speedmaster.gold;

import java.util.ArrayList;
import java.util.List;

class AAA{}
class BBB extends AAA {}
public class G4_02_generic {
    public static void main(String[] args) {
        func(new ArrayList<AAA>());
        func(new ArrayList<BBB>());
        //func(new ArrayList<? extends AAA>());
        //func(new ArrayList<? super BBB>());
        func(new ArrayList<Object>());
    }
    static void func(List<? super BBB> list){
        System.out.println("OK");
    }
}

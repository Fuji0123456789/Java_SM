package speedmaster.gold;

import java.util.ArrayList;
import java.util.List;

class AAAG4_3{}
class BBBG4_3 extends AAAG4_3 {}
class Main {
    //public void addData(List<? super BBBG4_3> list){
    //public void addData(List<? extends BBBG4_3> list){
    //public void addData(List list){
    public void addData(List<BBBG4_3> list){
            list.add(new BBBG4_3());
    }
}
public class G4_03_generic {
    public static void main(String[] args) {
        Main m = new Main();
        m.addData(new ArrayList<BBBG4_3>());
    }
}

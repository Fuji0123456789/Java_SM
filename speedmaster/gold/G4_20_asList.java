package speedmaster.gold;

import java.util.Arrays;
import java.util.List;

/**
 * G4_20_
 */
public class G4_20_asList {
    public static void main(String[] args) {
        Integer[] obj={1001,1002,1003};
        List<Integer> list=Arrays.asList(obj);
        //1001：1002：1003：

        //List<Integer> list=Arrays.asList(new Integer[3]);
        //null：null：null：

        //List<Integer> list=Arrays.asList({1001,1002,1003});
        /*
        Syntax error on token ".", @ expected after this token
        Syntax error, insert "SimpleName" to complete Expression
        */

        //List<Integer> list=Arrays.asList(1001,1002,1003);
        //1001：1002：1003：

        //List<Integer> list=Arrays.asList(new ArrayList<>());
        //ArrayList cannot be resolved to a type
        for (Integer i : list) {
            System.out.print(i+"：");
        }
    }
}
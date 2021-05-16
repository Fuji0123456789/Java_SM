package speedmaster.gold;

import java.util.Arrays;
import java.util.List;

public class G6_04_Stream{
    public static void main(String[] args) {
        List<String> guestList=Arrays.asList(
            "A",
            "BB",
            "CCC",
            "DDDD"
        );
        System.out.println(guestList.size());
        System.out.println(guestList.toString());

        //2
        System.out.println(guestList.stream().filter(x->x.length()>2).count());

        //4
        System.out.println(guestList.stream().map(x->x.length()>2).count());

        //System.out.println(guestList.stream().peek(x->x.length()>2).count().get());

        //System.out.println(guestList.stream().filter(x->x.length()>2).mapToInt(x->x).count());
    }
}
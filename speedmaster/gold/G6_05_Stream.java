package speedmaster.gold;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class G6_05_Stream{
    public static void main(String[] args) {
        List<String> strs=Arrays.asList(
            "SE11",
            "SE11 Silver",
            "SE11 Gold"
        );
        Predicate<String> f1=s->s.length()>5;
        Predicate<String> f2=new BookFilter() {
        	public boolean test(String s) {
				return s.contains("SE11");
			}
        };
        int count=(int)strs.stream().filter(f1).filter(f2).count();
        System.out.println(count);
    }
}
interface BookFilter extends Predicate<String>{
	public default boolean test(String str) {
		return str.equals("SE11");
	}
}
/*
2

*/
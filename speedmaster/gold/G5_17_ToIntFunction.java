package speedmaster.gold;

import java.util.function.ToIntFunction;

/**
 * G5_17_
 */
public class G5_17_ToIntFunction {
	public static void main(String[] args) {
		String str="I am a Java developer";
		ToIntFunction<String> index=str::indexOf;
		int x=index.applyAsInt("Java");
		System.out.println(x);
	}
}
package speedmaster.gold;

//The type parameter Integer is hiding the type Integer
public interface G5_03_Portable<Integer> {
	public default void delivery(Integer weight) {
		System.out.println("ABC delivery");
	}
	public void handCarry(Integer weight);
}

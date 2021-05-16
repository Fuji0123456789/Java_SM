package speedmaster.bronze;

class Apple{
	int seeds;
	void setSeeds(int seeds) {
		this.seeds=seeds;
	}
	void printSeeds() {
		System.out.println(seeds);
	}
}

public class B6_01_Instantiation {

	public static void main(String[] args) {
		Apple apl=new Apple();
		apl.setSeeds(10);
		apl.printSeeds();
	}

}

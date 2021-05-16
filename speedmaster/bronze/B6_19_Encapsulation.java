package speedmaster.bronze;
/**
 *
 */

class Apple6_19{
	//繧ｫ繝励そ繝ｫ蛹?
	private int seeds;
	public void setSeeds(int seeds) {
		this.seeds=seeds;
	}
	public int getSeeds() {
		return seeds;
	}
}

/**
 * @author 證∽ｸ?
 *
 */
public class B6_19_Encapsulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 閾ｪ蜍慕函謌舌＆繧後◆繝｡繧ｽ繝?繝峨?ｻ繧ｹ繧ｿ繝?
		Apple6_19 apple6_19=new Apple6_19();
		apple6_19.setSeeds(100);
		System.out.println(apple6_19.getSeeds());
	}

}

package speedmaster.bronze;
//http://proengineer.internous.co.jp/content/columnfeature/7853
/**
 *
 */

public class B2_01_BasicDataType {

	int num=5;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Hello World!
		System.out.println("Hello World!");

		//データ型
		//　基本データ型
		//　参照型

		//基本データ型
		//整数
		//8bit
		byte bmin=-128;
		byte bmax=127;
		//16bit
		short smin=-32768;
		short smax=32767;
		//32bit
		int imin=-2147483648;
		int imax=2147483647;
//		99
		int i1='c';
		char c1=2;
		System.out.println(i1);
		//64bit
		long lmin1=-9223372036854775808l;
		long lmax1=9223372036854775807l;
		long lmin2=-9223372036854775808L;
		long lmax2=9223372036854775807L;

		//基本データ型
		//浮動小数点数
		//32bit
		float f1=3.14f;
		float f2=3.14F;
		//64bit
		double d1=10.34;

		//基本データ型
		//文字
		//16bit
		//char c1= �?;

		//基本データ型
		//真偽値
		boolean flag1=true;
		boolean flag0=false;

		System.out.println(""+bmax+"\n"+bmin+"\n"+c1+"\n"+d1+"\n"+f1+"\n"+f2+"\n"+flag0+"\n"+flag1+"\n"+i1+"\n"+imax+"\n"+imin+"\n"+lmax1+"\n"+lmax2+"\n"+lmin1+"\n"+lmin2+"\n"+smax+"\n"+smin);

		//参照型
		String s1="ABC";
		System.out.println(s1);
		int i2[]=new int[5];
		System.out.println(i2[0]);
	}
}

package speedmaster.gold;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class G3_10_catch {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("text.txt");
		//Java SE 9からは
		//Variable resource not allowed here for source level below 9
		try(fw;FileReader fr=new FileReader("text.txt")){
			fw.write("test");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IOException");
		}
	}
}

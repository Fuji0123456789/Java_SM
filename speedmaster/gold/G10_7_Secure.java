package speedmaster.gold;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class G10_7_Secure{
    public void func(String file) throws IOException{
        File f=new File(file);
        if (!f.exists()) {
            throw new FileNotFoundException("Error : "+f.getAbsolutePath());
        }
        FileReader fr=new FileReader(file);
        int c;
        while ((c=fr.read()) !=-1) {
            System.out.println((char)c);
        }
        fr.close();
    }
    /*
    public static void main(String[] args) {
        //C:\Users\暁丈\Documents\技術\手続型プログラミング言語\Java
        func("C:\\Users\\暁丈\\Documents\\技術\\手続型プログラミング言語\\Java\\Path.txt");
    }
    */
}

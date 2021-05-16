package speedmaster.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G9_01_in {
    public static void main(String[] args) {
        try(BufferedReader in=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(">> ");
            String s=in.readLine();
            System.out.println(s);
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
/*
>> aaaa
aaaa
*/
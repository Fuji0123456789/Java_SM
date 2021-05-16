package speedmaster.gold;

import java.io.Console;

public class G9_02_in {
    public static void main(String[] args) {
        Console c=System.console();
        while (true) {
            System.out.print(">> ");
            String data=c.readLine();
            if (data.equals("")) {
                break;
            }
            System.out.println("input : "+data);
        }
        System.out.println("---finish---");
    }
}
/*
>> aaaaaaaaaaaaaaaa
input : aaaaaaaaaaaaaaaa
>> bbbb
input : bbbb
>>
---finish---
*/
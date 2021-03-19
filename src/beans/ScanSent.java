package beans;

import java.util.*;

public class ScanSent
{

    public static void main(String[] args)
    {

        String sentence = "yuh wassup";
        Scanner sc = new Scanner(sentence);
        int count = 0;

        
        while (sc.hasNext())
        {
            count++;
            sc.next();
        }
        System.out.println("ur sentence has " + count + " words foo");
    }
}

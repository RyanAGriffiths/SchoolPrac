package IO_ScannersAndPrintWriters;

import java.util.*;

public class ScanSent2
{

    public static void main(String[] args)
    {

        String sentence = "yuh wassup";
        Scanner sc = new Scanner(sentence);
        int count = 0;
        int countThree = 0;

        
        while (sc.hasNext())
        {
            if(sc.next().length() >= 3)
            {
                countThree++;
            }
            count++;
            sc.next();
        }
        System.out.println("ur sentence has " + count + " words foo and " + countThree + " three letter words");
    }
}

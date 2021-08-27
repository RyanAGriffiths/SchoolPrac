package IO_ScannersAndPrintWriters;

import java.io.*;
import java.util.*;

public class Oldest
{

    public static void main(String[] args)
    {
        String names = "TK 21 Ryan 17 Bonaquisha 92 Casandra 9 Stop 1";

        Scanner sc = new Scanner(names);
        String oldestName = sc.next();
        int oldestAge = sc.nextInt();

        while (sc.hasNext())
        {
            String currentName = sc.next();
            int currentAge = sc.nextInt();

            if (currentAge > oldestAge)
            {
                oldestAge = currentAge;
                oldestName = currentName;
            }
        }
        System.out.println(oldestName + " " + oldestAge);
    }
}

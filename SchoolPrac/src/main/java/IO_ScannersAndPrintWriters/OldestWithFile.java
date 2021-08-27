package IO_ScannersAndPrintWriters;

import java.io.*;
import java.util.*;

public class OldestWithFile
{

    public static void main(String[] args) throws IOException
    {
        File name = new File("C:\\Users\\CLLB23\\Documents\\NetBeansProjects\\beans\\src\\beans\\test.txt");

        Scanner sc = new Scanner(name);
        String oldestName = sc.next();
        int oldestAge = sc.nextInt();
        String bean;
        
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
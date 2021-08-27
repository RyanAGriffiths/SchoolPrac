package IO_ScannersAndPrintWriters;

import java.util.*;

public class TelNums
{

    public static void main(String[] args)
    {
        String number = "47-08239482";
        Scanner sc = new Scanner(number);
        sc.useDelimiter("-");
        String newPrefix = "";

        int prefix = sc.nextInt();
        String num = sc.next();

        if (prefix == 45)
        {
            newPrefix += "876-";
        } else if (prefix == 47)
        {
            newPrefix += "877-";
        }
        System.out.println(newPrefix + num);
    }
}

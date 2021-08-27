 package IO_ScannersAndPrintWriters;

import java.util.*;
import javax.swing.*;

public class ExtractInitials
{

    public static void main(String[] args)
    {
        String fullName = JOptionPane.showInputDialog("Enter your full name");
        Scanner sc = new Scanner(fullName);
        String output = "";

        while (sc.hasNext())
        {

            String name = sc.next();
            if (sc.hasNext())
            {
                output += name.charAt(0);
            } else
            {
                output += " " + name;

            }

        }

        System.out.println(output);
    }
}

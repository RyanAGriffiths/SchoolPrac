package IO_ScannersAndPrintWriters;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class ReadNames2
{

    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\CLLB23\\Documents\\NetBeansProjects\\beans\\src\\beans\\Names.txt");
        //String fullName = JOptionPane.showInputDialog("Enter your full name");
        Scanner fileScanner = new Scanner(file);
        String output = "";
        while (fileScanner.hasNext())
        {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);

            while (lineScanner.hasNext())
            {

                String name = lineScanner.next();
                if (lineScanner.hasNext())
                {
                    output += name.charAt(0);
                } else
                {
                    output += " " + name + "\n";

                }
                System.out.println("");
            }
        }
        System.out.println(output);
    }
}

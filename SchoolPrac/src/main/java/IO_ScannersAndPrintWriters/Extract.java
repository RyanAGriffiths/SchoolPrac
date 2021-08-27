package IO_ScannersAndPrintWriters;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class Extract
{

    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\CLLB23\\Downloads\\Emails.txt");
        Scanner fileScanner = new Scanner(file);
        String name = "";
        String extension = "";
      
        

        while (fileScanner.hasNextLine())
        {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("@");
            
                name = lineScanner.next();
                extension = lineScanner.next();
                //System.out.println(extension + "HERE");
                
                Scanner extensionScanner = new Scanner(extension);
                extensionScanner.useDelimiter("[.]");
                String domain = extensionScanner.next();
                //System.out.println(extension + " " + domain + "ÖVER HERE");
            
            System.out.println("Username \t\t" + "Domain \n" + name + "\t\t\t" + domain);
        }
    }
}

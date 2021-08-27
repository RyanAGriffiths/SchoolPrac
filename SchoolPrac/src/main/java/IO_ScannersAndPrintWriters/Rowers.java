package IO_ScannersAndPrintWriters;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class Rowers
{

    public static void main(String[] args) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new FileWriter("Output.txt", true));
        File rowerFile = new File("C:\\Users\\CLLB23\\Downloads\\Rowing.txt");
        Scanner fileScanner = new Scanner(rowerFile);

        String num1 = "";
        String firstname = "";
        String surname = "";
        String t3 = "";
        String num2 = "";
        String filename = "C:\\Users\\CLLB23\\Downloads\\Rowing.txt";
        PrintWriter boom = new PrintWriter(filename);
        
        while (fileScanner.hasNextLine())
        {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);

            lineScanner.useDelimiter("#");
            num1 = lineScanner.next();
            String names = lineScanner.next();
            t3 = lineScanner.next();
            num2 = lineScanner.next();

            Scanner nameScanner = new Scanner(names).useDelimiter(",");
            surname = nameScanner.next();
            firstname = nameScanner.next();
            
            filename = "C:\\Users\\CLLB23\\Downloads\\" + t3 + ".txt";
            
            boom.println(num1 + "\t" + firstname + "\t" + surname + "\t" + t3 + "\t" + num2);
            boom.close();
            System.out.println(num1 + "\t" + firstname + "\t" + surname + "\t" + t3 + "\t" + num2);
        }
        
        outFile.close();
        fileScanner.close();
    }
}
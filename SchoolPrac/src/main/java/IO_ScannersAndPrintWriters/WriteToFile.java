package IO_ScannersAndPrintWriters;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class WriteToFile
{

    public static void main(String[] args) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new FileWriter("Data.txt", true));
        String line = JOptionPane.showInputDialog("Enter a line of text - STOP to exit");

        while (!line.equals("STOP"))
        {
            outFile.println(line);
            line = JOptionPane.showInputDialog("Enter a line of text - STOP to exit");
        }
        outFile.close();
    }
}

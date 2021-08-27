package IO_ScannersAndPrintWriters;

import java.util.*;
import javax.swing.*;
import java.io.*;

class BirthDates
{

    public static void main(String[] args) throws IOException
    {
        //Scanners and files
        //fileScanner
        File file = new File("C:\\Users\\CLLB23\\Downloads\\Birthdates.txt");
        Scanner fileScanner = new Scanner(file);
        //lineScanner
        String line = fileScanner.nextLine();
        Scanner lineScanner = new Scanner(line);
        lineScanner.useDelimiter("#");

        while (lineScanner.hasNext())
        {

            String firstname = lineScanner.next();
            String surname = lineScanner.next();
            String birthday = lineScanner.next();
            String newBirthday = "";
            String year = "";

            newBirthday += birthday.substring(4, 6);
            newBirthday += birthday.substring(2, 4);
            year += birthday.substring(0, 2);

            System.out.println(firstname + " " + surname + " " + newBirthday + "19" + year);
        }
    }
}

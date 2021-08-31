package ObjectArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FriendArray
{

    private Friend frArr[] = new Friend[25];
    private int size = 0;
    Date dob;

    public FriendArray()
    {

        Scanner sc;
        try
        {
            sc = new Scanner(new File("data\\Friends.txt"));
            String line;
            String name;
            String dob;
            while (sc.hasNext())
            {

                line = sc.next();
                Scanner lsc = new Scanner(line).useDelimiter("#");
                name = lsc.next();
                dob = lsc.next();
                lsc.close();

                frArr[size] = new Friend(name, dob);
                size++;

            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("check the file name/path");
        }
    }

    public String toString()
    {

        String output = "";
        for (int i = 0; i < size; i++)
        {

            output += frArr[i] + "\n";
        }
          return output;
    }

    public void sort()
    {

        for (int i = 0; i < size - 1; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (frArr[i].compareTo(frArr[j]) > 0)
                {

                    Friend temp = frArr[j];
                    frArr[j] = frArr[i];
                    frArr[i] = temp;
                }
            }
        }
    }

    public int binarySearch(String n)
    {

        int start = 0;
        int end = size - 1;
        while (start <= end)
        {
            int middle = (start + end) / 2;
            if (frArr[middle].getName().equals(n))
            {
                return middle;
            } 
            else if (frArr[middle].getName().compareTo(n) > 0)
            {
                end = middle-1;
            }
            else 
            {
                start = middle+1;
            }
            
        }
        return -1;
    }

}

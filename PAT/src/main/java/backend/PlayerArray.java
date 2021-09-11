package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlayerArray
{

    private Player[] plArr = new Player[150];
    private int size = 0;

    public PlayerArray()
    {

        try
        {
            Scanner sc = new Scanner(new File("data\\studentData.txt"));
            while (sc.hasNextLine())
            {
                int age = sc.nextInt();
                String name = sc.next();
                String position = sc.next();

                Player p = new Player(age, name, position);
                plArr[size] = p;
                size++;
            }

        } catch (FileNotFoundException ex)
        {
            System.out.println("big boy problem");
        }
    }

    private int binarySearch(String email)
    {
        int start = 0;
        int end = size - 1;

        while (start <= end)
        {
            int middle = (start + end) / 2;
            if (plArr[middle].getName().equals(email))
            {
                return middle;
            } else if (email.compareTo(plArr[middle].getName()) > 0)
            {
                start = middle + 1;
            } else
            {
                end = middle - 1;
            }
        }
        return -1;
    }

    public void shiftLeft(int index)
    {
        for (int i = index; i < size; i++)
        {
            plArr[i] = plArr[i + 1];
        }
        size--;
    }

    public void shiftRight(int index)
    {
        size++;
        for (int i = size - 1; i > index - 1; i--)
        {
            plArr[i] = plArr[i - 1];
        }
    }

    public void print()
    {

        try
        {

            PrintWriter pw = new PrintWriter(new File("data\\userData.txt"));
            for (int i = 0; i < size; i++)
            {
                pw.println(plArr[i]);
            }
            pw.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("yea naw... (print function)");
        }
    }

    public void addPlayer(int age, String name, String position)
    {
        this.shiftRight(size - 1);
        plArr[size - 1] = new Player(age, name, position);
        this.print();
    }

    public void delete(String name)
    {
        for (int i = 0; i < size; i++)
        {
            plArr[]
        }
    }
}

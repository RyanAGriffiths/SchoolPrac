package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserArray
{

    private User userArr[] = new User[150];
    private int size = 0;

    public UserArray()
    {

    }

    public boolean checkUser(String email, String password)
    {
        for (int i = 0; i < size - 1; i++)
        {
            if (userArr[i].getEmail().equals(email))
            {
                return userArr[i].checkPassword(password);
            }
        }
        return false;
    }

    public void shiftLeft(int index)
    {
        for (int i = index; i < size; i++)
        {
            userArr[i] = userArr[i + 1];
        }
        size--;
    }

    public void shiftRight(int index)
    {
        size++;
        for (int i = size - 1; i > index - 1; i--)
        {
            userArr[i] = userArr[i - 1];
        }
    }

    public void print()
    {

        try
        {

            PrintWriter pw = new PrintWriter(new File("data\\userData.txt"));
            for (int i = 0; i < size; i++)
            {
                pw.println(userArr[i]);
            }
            pw.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("yea naw... (print function)");
        }
    }

    //adduser - add to array, print array to txt
    public void register(String email, String password)
    {
        this.shiftRight(size - 1);
        userArr[size - 1] = new User(email, password);
        this.print();
    }

   
    //deleteUser - delete from array, print array to txt
    //binarySearch
    //getUser
    //setUser
}

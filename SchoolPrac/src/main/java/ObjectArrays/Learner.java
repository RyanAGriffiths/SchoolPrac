package ObjectArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Learner
{

    private String fullName;
    private double t1Mark;
    private double t2Mark;
    private double t3Mark;

    public Learner(String fullName, double t1Mark, double t2Mark, double t3Mark)
    {
        this.fullName = fullName;
        this.t1Mark = t1Mark;
        this.t2Mark = t2Mark;
        this.t2Mark = t3Mark;
    }

    public double getT1Mark()
    {
        return t1Mark;
    }

    public void setT1Mark(double t1Mark)
    {
        this.t1Mark = t1Mark;
    }

    public double getT2Mark()
    {
        return t2Mark;
    }

    public void setT2Mark(double t2Mark)
    {
        this.t2Mark = t2Mark;
    }

    public double getT3Mark()
    {
        return t3Mark;
    }

    public void setT3Mark(double t3Mark)
    {
        this.t3Mark = t3Mark;
    }

   
    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

     public String getFirstName()
    {

        Scanner sc = new Scanner(fullName);
        String firstName = sc.next();
        sc.close();
        return firstName;
    }

    public String getSurname()
    {

        Scanner sc = new Scanner(fullName).useDelimiter(" ");
        String firstName = sc.next();
        String surname = sc.next();
        sc.close();
        return surname;
    }

    public String toString()
    {

        return "name: " + fullName + "\nterm 1 mark: " + t1Mark + "\nterm 2 mark: " + t2Mark + "\nterm 3 mark: " + t3Mark;
    }

    public double getAverage()
    {

        return (t1Mark + t2Mark + t3Mark) / 2;
    }

}

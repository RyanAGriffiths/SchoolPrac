/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DVTTwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryang
 */
public class Appointment
{

    public static boolean containsOnlyLetters(String input)
    {
        //Character.isLetter(char c)
        for (int i = 0; i < input.length(); i++)
        {
            if (!Character.isLetter(input.charAt(i)))
            {

                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyDigits(String id)
    {
        for (int i = 0; i < id.length(); i++)
        {
            if (!Character.isDigit(id.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    public boolean isPresent(String n)
    {
        boolean rtrn;
        if (n.isEmpty())
        {
            rtrn = false;
        } else
        {
            rtrn = true;
        }
        return rtrn;
    }

    public boolean isStringValid(String n)
    {
        boolean rtrn = false;
        if (this.isPresent(n))
        {
            for (int i = 0; i < n.length(); i++)
            {
                if (Character.isDigit(n.charAt(i)))
                {
                    rtrn = false;
                    break;
                }
            }
        } else
        {
            rtrn = true;
        }
        return rtrn;
    }

    public boolean checkAge(String id)
    {
        try
        {
            String id6 = id.substring(0, 5);
            Date bDay = new SimpleDateFormat("yy/mm/dd").parse(id6);
            System.out.println(bDay);
        } catch (ParseException ex)
        {
            System.out.println("Could not verify age");
        }
        return true;
    }

}

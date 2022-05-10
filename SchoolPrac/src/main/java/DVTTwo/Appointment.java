package DVTTwo;

public class Appointment
{
    //validates if the input contains only letters and no numbers or foreign characters
    public static boolean containsOnlyLetters(String input)
    {
        
        for (int i = 0; i < input.length(); i++)
        {
            if (!(Character.isLetter(input.charAt(i)) || input.charAt(i) == ' ' || input.charAt(i) == '-'))
            {
                return false;
            }
        }
        return true;
    }

    //validates if the input contains only digits and no letters or foreign characters
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
}

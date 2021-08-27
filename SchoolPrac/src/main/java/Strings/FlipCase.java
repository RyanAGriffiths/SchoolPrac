package Strings;
import javax.swing.*;
public class FlipCase 
{
    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a String of any length");
        String output = "";
        
        for(int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch))
                output += Character.toLowerCase(ch);
            else
            {
                output += Character.toUpperCase(ch);
            }
        }
        
        System.out.println(output);
    }
}

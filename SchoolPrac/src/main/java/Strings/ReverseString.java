package Strings;
import javax.swing.*;
public class ReverseString 
{
    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a sentence: ");
        String output = "";
        
        for (int i = input.length(); i > 0; i--)
        {
            output += input.charAt(i);
        }
        System.out.println(output);
    }
}

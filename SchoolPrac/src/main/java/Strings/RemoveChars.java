package Strings;
import javax.swing.*;
public class RemoveChars 
{
    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a sentence");
        String unwanted = JOptionPane.showInputDialog("Enter unwanted characters");
        String output = "";
        
        for(int i = 0; i < input.length(); i++) 
        {
        int currentUnwanted = input.indexOf(unwanted);
        int nextThing = input.lastIndexOf(unwanted, currentUnwanted + 1);
        output += (input.substring(0, currentUnwanted) + input.substring(nextThing+1));
        currentUnwanted = nextThing;
        break;
        }
        System.out.println(output);
    }
}

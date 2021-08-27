
package Strings;

import javax.swing.*;

public class CensorA 
{
    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a sentence: ");
        String output = "";
        
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) != 'a' && input.charAt(i) != 'A')
                output += input.charAt(i);
            else
            {
              output += "$";
             
            }
            
        }
        System.out.println(output);
    }
}

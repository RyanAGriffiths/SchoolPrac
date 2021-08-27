package Strings;
import javax.swing.*;

public class VowelsOnly 
{
    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a sentence: ");
        String output = "";
        
        for(int i = 0; i < input.length(); i++)
        {
            switch(input)
            {
                case "a": output += input.charAt(i);
                          break;
                case "e": output += input.charAt(i);
                          break;
                case "i": output += input.charAt(i);
                          break;       
                case "o": output += input.charAt(i);
                          break; 
                case "u": output += input.charAt(i);
                          break;             
            }
            
                
        }
        System.out.println(output);
    }
}


package Strings;

import javax.swing.JOptionPane;

public class WordGames 
{
    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a single word");
        String output = "";
        String second;
        int points = 0;
        
        for(int i = input.length(); i <= input.length() ; i--)
        {
            second = JOptionPane.showInputDialog("Enter another word");
            if(input.charAt(i) == second.lastIndexOf(second))
                points++;
            else
            {
                break;
            }
        }
        System.out.println("You got " + points + "!");
    }
}

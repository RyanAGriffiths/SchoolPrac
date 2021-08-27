package Strings;
import javax.swing.JOptionPane;
public class GenerateEmail 
{
    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter your first and last name");
        String output = "";
        
        int space = input.indexOf(" ");
        int space2 = input.lastIndexOf(" ", space + 1);
        String firstname = input.substring(0, space);
        String lastname = input.substring(space2 + 1);
        output += firstname + "." + lastname + "@reddam.house";
           
        System.out.println(output);
    }
}

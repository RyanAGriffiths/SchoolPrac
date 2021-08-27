package Strings;
import javax.swing.*;

public class CellNumberFormat 
{
    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a 10 digit South African phone number: ");
       // int number = Integer.parseInt(input);

        System.out.println("+27" + input.substring(1, 3) + " " +  input.substring(3, 6) + " " + input.substring(6, 10));
    }
}
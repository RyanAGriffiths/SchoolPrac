package IO_ScannersAndPrintWriters;
import java.util.*;
import javax.swing.*;
public class Details 
{
    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Please enter your firstname, ID number, height in metres and whether you smoke or not (true or false)");
        //String output = "";
        
        Scanner sc = new Scanner (input);
        String name = sc.next();
        int id = sc.nextInt();
        int height = sc.nextInt();
        boolean ans = sc.nextBoolean();
        sc.close();
        
        System.out.println("Firstname: " + name + "\n" + "ID number: " + id + "\n" + height + "m tall" + "\n" + "Smokes? " + ans);
    }
}

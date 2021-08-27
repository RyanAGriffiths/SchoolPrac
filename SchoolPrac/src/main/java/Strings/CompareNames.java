package Strings;
import javax.swing.*;
public class CompareNames 
{
    public static void main(String[] args) 
    {
        
    String name1 = JOptionPane.showInputDialog("Enter a name");
    String name2 = JOptionPane.showInputDialog("Enter a second name");
    String name3 = JOptionPane.showInputDialog("Enter a third name");
    String name4 = JOptionPane.showInputDialog("Enter a fourth name");
    String name5 = JOptionPane.showInputDialog("Enter a fifth name");
    String out = "";
    
        if(name1.compareTo(name2) < 0)
            out = name1;
        else if(name1.compareTo(name2) >= 0)
        {
            out = name2;
        }
        System.out.println(out);
        
        if(name1.compareTo(name3) < 0)
            out = name1;
        else if(name1.compareTo(name3) >= 0)
        {
            out = name3;
        }
        System.out.println(out);
        
        if(name1.compareTo(name4) < 0)
            out = name1;
        else if(name1.compareTo(name4) >= 0)
        {
            out = name4;
        }
        System.out.println(out);
        
        if(name1.compareTo(name5) < 0)
            out = name1;
        else if(name1.compareTo(name5) >= 0)
        {
            out = name5;
        }
        
        System.out.println("The first name alphabetically is " + out);
            
    //a compared to b returns -1
  }
}
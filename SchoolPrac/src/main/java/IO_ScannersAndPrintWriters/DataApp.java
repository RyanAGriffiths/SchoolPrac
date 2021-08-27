package IO_ScannersAndPrintWriters;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class DataApp
{
    public static void main(String[] args) throws IOException
    {
        
        //call methods
        
    }
    
    public static void nextRecords()throws IOException {//chonge to try and catch stootment l8r.
        
    
        PrintWriter newFile = new PrintWriter(new FileWriter("Data.txt"));
        
        
        String firstname = JOptionPane.showInputDialog("Enter your first name");
        String surname = JOptionPane.showInputDialog("Enter your surname");
        String username = JOptionPane.showInputDialog("Enter your username");
        String password = JOptionPane.showInputDialog("Enter your password");
        String email = JOptionPane.showInputDialog("Enter your email address");
        
        newFile.print(firstname + "." + surname + "#" + username + "#" + password + "#" + email);
        newFile.close();
    }
    
    public static void setRecords() throws FileNotFoundException{
            
        Scanner pp = new Scanner(new File("SAME FILE PATH")); 
        
        
    }
}
//Username and data storage app
//tokens: 

//token 1: name.surname
//(delimiter) #
//token 2: username
//(delimiter) #
//token 3: password
//(delimiter) #
//token 4: email address

/*
public static void main 
    Input + initial
    printwriter (newFile)
    
*/

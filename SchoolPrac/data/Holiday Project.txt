package Challenges;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class DataApp {

    public static void main(String[] args) throws IOException {

        nextRecords();
        getRecords();

    }

    public static void nextRecords() {

        try {
            PrintWriter newFile = new PrintWriter(new FileWriter("Data.txt"));

            String firstname = JOptionPane.showInputDialog("Enter your first name");
            String surname = JOptionPane.showInputDialog("Enter your surname");
            String username = JOptionPane.showInputDialog("Enter your username");
            String password = JOptionPane.showInputDialog("Enter your password");
            String email = JOptionPane.showInputDialog("Enter your email address");

            newFile.print(firstname + "@" + surname + "#" + username + "#" + password + "#" + email);
            newFile.close();
        } catch (Exception e) {
            //panic - I'm not sure what you do in the catch (maybe sout the problem?)
        }
    }

    public static void getRecords() throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("C:\\Users\\ryang\\OneDrive\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\Data.txt"));
        fileScanner.useDelimiter("#");

        String t1 = fileScanner.next();
        String t2 = fileScanner.next();
        String t3 = fileScanner.next();
        String t4 = fileScanner.next();

        Scanner tokenScanner = new Scanner(t1).useDelimiter("@");
        String first = tokenScanner.next();
        String second = tokenScanner.next();

        System.out.println("first name: " + first + "\n" + "surname: " + second + "\n" + "username: " + t2 + "\n" + "password: " + t3 + "\n" + "email: " + t4);
        fileScanner.close();
        tokenScanner.close();

    }
}

//Username and data storage app
//tokens:
//token 1: name@surname
//(delimiter) #
//token 2: username
//(delimiter) #
//token 3: password
//(delimiter) #
//token 4: email address

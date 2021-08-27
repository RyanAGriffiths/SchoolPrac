package Strings;
import java.util.*;
public class ScannerClassTest 
{
    public static void main(String[] args) 
    {
        String line = "Hello 45 65.9 true";
        
        Scanner scLine = new Scanner (line);
        String greet = scLine.next();
        int num = scLine.nextInt();
        double real = scLine.nextDouble();
        boolean ans = scLine.nextBoolean();
        scLine.close();
        System.out.println(greet + " " + num + " " + real + " " + " " + ans);
        
    }
}

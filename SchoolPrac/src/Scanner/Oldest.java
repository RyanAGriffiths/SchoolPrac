package Scanner;
import java.util.*;
import javax.swing.*;

public class Oldest 
{
    public static void main(String[] args) 
    {
        String input = "Luke 4 Josh 13 Ryan 16 Mike 21 Pete 51 Stop 82";
        
        //current name and current age, and compare it to previous age.
        Scanner sc = new Scanner (input);
        String currentName = sc.next();
        int currentAge = sc.nextInt();
        
        sc.close();
        System.out.println();
    }
}

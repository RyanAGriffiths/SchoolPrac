package ObjectArrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FriendArray {

    private Friend frArr[] = new Friend[25];
    private int size = 0;

    public FriendArray() {

        Scanner sc;
        try {
            sc = new Scanner(new File("resources\\Friends.txt"));
            String line;
            String name;
            int age;
            while (sc.hasNext()) {
                
                line = sc.next();
                Scanner lsc = new Scanner(line).useDelimiter("#");
                name = lsc.next();
                age = lsc.nextInt();
                lsc.close();
                
                frArr[size] = new Friend (name, age);
                size++;
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("check the file name/path");
        }
    }
    
    public String toString(){
        
        String output = "";
        for(int i = 0; i < size; i++){
            
            output += frArr[i] + ", ";
        }
        System.out.println(size);
        return output;
    }
    
    public void sort(){
        
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--) {
            for (int i = 0; i < currentIndex; i++) {
                if (frArr[i].compareTo(frArr[i + 1]) > 0) {
                  
                }
            }
        }
        
    }
}

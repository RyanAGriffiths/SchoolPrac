package IO_ScannersAndPrintWriters;

import javax.swing.*;
import java.util.*;

public class ScanSent {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ayo, input sentence");

        Scanner sc = new Scanner(input);
        int count = 0;
        int threeWords = 0;
        String currentWord;
        while (sc.hasNext()) {
            currentWord = sc.next();
            if (currentWord.length() <= 3) {
                threeWords++;
            }
            count++;
        }

        sc.close();
        System.out.println("Your sentence has " + count + " words" + " and there are " + threeWords + " 3-letter words in yo sentunce foo");
    }
}

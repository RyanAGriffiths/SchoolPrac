/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_ScannersAndPrintWriters;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileArray
{

    public static void main(String[] args) throws IOException
    {
        //PrintWriter newFile = new PrintWriter(new FileWriter("C:\\Users\\CLLB23\\Documents\\Nums.txt"));
        Scanner sc = new Scanner(new File("C:\\Users\\CLLB23\\Documents\\Nums.txt"));
        int[] arr = new int[150];
        int size = 0;
        while(sc.hasNext())
        {
            arr[size] = sc.nextInt();
            size++;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(arr[i]);
        }
    }
}

package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArrayPractice {

    private int[] arr = new int[150];
    private int size;

    public ArrayPractice()
    {

        File f = new File("D:\\Users\\ryang\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\Arrays\\nums.txt");
        try
        {
            Scanner sc = new Scanner(f);
            while (sc.hasNextInt())
            {
                arr[size] = sc.nextInt();
                size++;
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("uh oh, not good... Bonaquisha gon be mad");
        }
    }

    public void bubbleSort()
    {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--)
        {
            for (int i = 0; i < currentIndex; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }

        }
    }

    public int binarySearch(int num)
    {

        int start = 0;
        int end = size - 1;
        while (start <= end)
        {

            int middle = (start + end) / 2;
            if (num == arr[middle])
            {
                return middle;
            } else if (num < arr[middle])
            {
                end = middle - 1;

            } else
            {
                start = middle + 1;
            }
        }
        return -1;
    }

    public void insert(int num)
    {

        int index = -1;
        for (int i = 0; i < size; i++)
        {
            if (arr[i] > num)
            {
                index = i;
                break;
            }
        }
        System.out.println("index:" + index);
        shiftRight(index);
        arr[index] = num;

    }
    public void delete(int num){
        
        int index = binarySearch(num);
        if(index > 0)
        shiftLeft(index);
        else{
            System.out.println("That number does not exist in this array");
        }
    }

    public void print()
    {
        System.out.print("[ ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public void shiftRight(int index)
    {

        size++;
        for (int i = size - 1; i > index; i--)
        {
            arr[i] = arr[i - 1];
        }

    }
    
    public void shiftLeft(int index){
        
        for(int i = index; i < size; i++){
            arr[i] = arr[i + 1];
        }
        size--;

    }
}

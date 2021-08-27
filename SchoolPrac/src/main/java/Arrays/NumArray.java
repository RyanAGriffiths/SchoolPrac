package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumArray
{

    private int[] arr = new int[150];
    private int size;


    public NumArray()
    {
        this.size = 0;
        try
        {
            File f = new File("resources\\numbers.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext())
            {
                arr[size] += sc.nextInt();
                size++;

            }
            sc.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("uh oh...");
        }
    }

    public void selectiveSortImproved()
    {

        for (int currentIndex = 0; currentIndex < size; currentIndex++)
        {
            int lowIndex = currentIndex;
            for (int i = currentIndex; i < size; i++)
            {

                //int currentIndex = arr[lowIndex + 1];
                if (arr[i] < arr[lowIndex])
                {
                    lowIndex = i;
                }

            }

            int temp = arr[lowIndex];
            arr[lowIndex] = arr[currentIndex];
            arr[currentIndex] = temp;
        }
    }

    public void selectiveSort()
    {
        int comps = 0;
        int switches = 0;
        for (int currentIndex = 0; currentIndex < size; currentIndex++)
        {

            for (int i = currentIndex; i < size; i++)
            {

                comps++;
                if (arr[i] < arr[currentIndex])
                {
                    int temp = arr[i];
                    arr[i] = arr[currentIndex];
                    arr[currentIndex] = temp;
                    switches++;
                }

            }

        }

        System.out.println("Comps: " + comps + " Switches: " + switches);
    }

    public void bubbleSort()
    {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--)
        {
            for (int x = 0; x < currentIndex; x++)
            {
                if (arr[x] > arr[x + 1])
                {
                    int temp = arr[x + 1];
                    arr[x + 1] = arr[x];
                    arr[x] = temp;

                }
            }
        }
    }

    public void bubbleSortImproved()
    {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--)
        {
            boolean flag = true;
            for (int x = 0; x < currentIndex; x++)
            {
                if (arr[x] > arr[x + 1])
                {
                    int temp = arr[x + 1];
                    arr[x + 1] = arr[x];
                    arr[x] = temp;
                    flag = false;

                }
            }
            if (flag)
            {
                break;
            }
        }
    }

    public void print()
    {
        System.out.print("[ ");
        for (int i = 0; i < size; i++)
        {

            System.out.print(arr[i] + " ");

        }
        System.out.println(" ]");
    }

    public int linearSearch(int val)
    {
        
        for (int i = 0; i < size; i++)
        {
            if (arr[i] == val)
            {
                return i;
            }

        }
        return -1;
    }

    public int binarySearch(int val)
    {

        int start = 0;
        int end = size - 1;
        while(start <= end) 
        {
            int middle = (start + end) / 2;

            if (arr[middle] == val)
            {
                return middle;
            } 
            else if (arr[middle] > val)
            {
                end = middle - 1;
            } 
            else
            {
                start = middle + 1;
            }

        }
        return -1;
    }

    public void insert(int num)
    {
        
        int index = -1;
        for(int i = 0; i < size; i++){
            if (arr[i] > num){
                index = i;
                break;               
            }
        }
        
        shiftRight(index);
        arr[index] = num;
    }

    public void delete(int num)
    {
        int index = binarySearch(num);
        System.out.println(index);
        if(index > 0){
            shiftLeft(index);
        }
        
    }
    
    public void removeDupes(){
        
        for(int i = 0; i < size-1; i++){
            if(arr[i] == arr[i+1]){
                shiftLeft(i);
                i--;
            }
        }

    }

    public void shiftRight(int index)
    {
        size++;
        for (int i = size-1; i > index; i--)
        {
            arr[i] = arr[i - 1];
        }
    }

    public void shiftLeft(int index)
    {
        for (int i = index; i < size-1; i++)
        {
            arr[i] = arr[i + 1];
        }
        size--;
    }
}

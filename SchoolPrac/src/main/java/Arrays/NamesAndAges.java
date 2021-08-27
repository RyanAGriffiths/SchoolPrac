package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NamesAndAges
{

    private int[] ages = new int[150];
    private String[] names = new String[150];
    private int size;


    public NamesAndAges()
    {
        this.size = 0;
        
//Number Scanner
        try
        {
            File f = new File("C:\\Users\\Ryang\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\Arrays\\numbers.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext())
            {
                ages[size] += sc.nextInt();
                size++;

            }
            sc.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("uh oh...");
        }
        //Name Scanner
        try
        {
            File f = new File("resources\\names.txt");
            Scanner sc = new Scanner(f);
            size = 0;
            while (sc.hasNext())
            {
                names[size] = sc.next();
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
                if (names[i].compareTo(names[lowIndex]) < 0)
                {
                    lowIndex = i;
                }

            }

            int temp = ages[lowIndex];
            ages[lowIndex] = ages[currentIndex];
            ages[currentIndex] = temp;
            
            String tempStr = names[lowIndex];
            names[lowIndex] = names[currentIndex];
            names[currentIndex] = tempStr;
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
                if (names[i].compareTo(names[currentIndex]) < 0)
                {
                    String tempStr = names[i];
                    names[i] = names[currentIndex];
                    names[currentIndex] = tempStr;
                    
                    int temp = ages[i];
                    ages[i] = ages[currentIndex];
                    ages[currentIndex] = temp;
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
                if (names[x].compareTo(names[x + 1]) > 0)
                {
                    int temp = ages[x + 1];
                    ages[x + 1] = ages[x];
                    ages[x] = temp;
                    
                    String tempStr = names[x + 1];
                    names[x + 1] = names[x];
                    names[x] = tempStr;

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
                if (names[x].compareTo(names[x + 1]) > 0 )
                {
                    int temp = ages[x + 1];
                    ages[x + 1] = ages[x];
                    ages[x] = temp;
                    
                    String tempStr = names[x + 1];
                    names[x + 1] = names[x];
                    names[x] = tempStr;
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

            System.out.print(ages[i] + " ");

        }
        System.out.println("]");
        
        System.out.print("[ ");
        for (int i = 0; i < size; i++)
        {

            System.out.print(names[i] + " ");

        }
        System.out.println("]");
    }

    public int linearSearch(String val)
    {
        
        for (int i = 0; i < size; i++)
        {
            if (names[i].equals(val))
            {
                return i;
            }

        }
        return -1;
    }

    public int binarySearch(String val)
    {

        int start = 0;
        int end = size - 1;
        while(start <= end) 
        {
            int middle = (start + end) / 2;

            if (names[middle].equals(val))
            {
                return middle;
            } 
            else if (names[middle].compareTo(val) > 0)
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

    public void insert(String num, int age)
    {
        
        int index = -1;
        for(int i = 0; i < size; i++){
            if (names[i].compareTo(num) > 0){
                index = i;
                break;               
            }
        }
        
        shiftRight(index);
        names[index] = num;
        ages[index] = age;
    }

    public void delete(String num)
    {
        int index = binarySearch(num);
        System.out.println(index);
        if(index > 0){
            shiftLeft(index);
        } 
    }
    
    public void removeDupes(){
        
        for(int i = 0; i < size-1; i++){
            if(names[i].equals(names[i+1])){
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
            names[i] = names[i - 1];
        }
    }

    public void shiftLeft(int index)
    {
        for (int i = index; i < size-1; i++)
        {
            names[i] = names[i + 1];
            ages[i] = ages[i + 1];
        }
        size--;
    }
}

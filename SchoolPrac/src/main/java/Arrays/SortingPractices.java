package Arrays;

public class SortingPractices
{

    int[] arr = new int[100];// = {1, 2, 3, 4, 5, 6, 9, 8, 7};
    int size = 0;

    public SortingPractices(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            this.arr[i] = arr[i];
            size++;
        }

    }

    public void SelectionSort()
    {
        //selection sort

        for (int i = 0; i < this.size; i++)
        {

            for (int j = i + 1; j < this.size; j++)
            {

                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

    }

    public void SelectionSortImproved()
    {

        for (int i = 0; i < this.size; i++)
        {
            int lowest = i;
            for (int j = i + 1; j < this.size; j++)
            {
                if (arr[j] < arr[lowest])
                {
                    lowest = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[lowest];
            arr[lowest] = temp;
        }
    }

    public void BubbleSort()
    {
        for (int i = size - 1; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void BubbleSortImproved()
    {
        for (int i = size - 1; i >= 0; i--)
        {
            boolean sorted = true;
            for (int j = 0; j < i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }

            }

            if (sorted)
            {
                break;
            }
        }
    }

    public int LinearSearch(int num)
    {
        
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == num)
            {
                return i;
            }

        }
        return -1;
    }

    public int BinarySearch(int num)
    {
        
        int start = 0;
        int end = size - 1;
        
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (arr[mid] < num)
            {
                start = mid + 1;
            }

            if (arr[mid] > num)
            {
                end = mid - 1;
            }

            if (arr[mid] == num)
            {
                return mid;
            }
        }
        return -1;
    }

    public void print()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
}

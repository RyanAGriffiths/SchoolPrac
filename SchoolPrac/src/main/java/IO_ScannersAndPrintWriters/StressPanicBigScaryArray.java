package IO_ScannersAndPrintWriters;

public class StressPanicBigScaryArray
{

    public static void main(String[] args)
    {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length - 1; i++)
        {
            arr[i] = (int) (Math.random() * 11);
            System.out.println(arr[i]);

        }
        int sum = 0;
        int avg = 0;
        for (int j = 0; j < arr.length - 1; j++)
        {
            sum += arr[j];

        }
        System.out.println("sum of numbas = " + sum);
        avg = sum/10;
        System.out.println("average = " + avg);
    }
}

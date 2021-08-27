
package Arrays;

public class UseSortingPractice
{
    public static void main(String[] args)
    {
       
        int[] arr = {1, 2, 3, 7, 5, 9, 4, 8, 1};
        SortingPractices p = new SortingPractices(arr);
        //p.SelectionSortImproved();
        p.BubbleSortImproved();
        p.print();
        int num = p.BinarySearch(9);
        System.out.println(num);
        p.print();
    }
}

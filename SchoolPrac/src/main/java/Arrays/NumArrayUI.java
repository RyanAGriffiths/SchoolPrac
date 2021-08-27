package Arrays;

public class NumArrayUI
{

    public static void main(String[] args)
    {
        NumArray arr = new NumArray();
        arr.print();
        arr.selectiveSortImproved();
        arr.print();
        arr.insert(1);
        arr.print();
        arr.delete(23);
        arr.print();
        arr.removeDupes();
        arr.print();
        //arr.selectiveSort();
        //arr.print();
        //arr.bubbleSort();
        
        //arr.print();
        //arr.bubbleSortImproved();
//        int index = arr.binarySearch(1);
//        arr.print();

    }
}

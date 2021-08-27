package Arrays;

public class ArrayPracticeUI {
    public static void main(String[] args) {
        ArrayPractice p = new ArrayPractice();
        p.print();
        p.bubbleSort();
        p.print();
        int num = p.binarySearch(65);
        System.out.println("Your number was found at position: " + num);
        p.print();
    }
}
package Activites;

public class Line {

    int size = 2;
    String pattern = "*";

    public void draw() {
        for (int i = 1; i <= size; i++) {
            System.out.print(pattern);
        }
        System.out.println();
    }//draw method
}//Line method
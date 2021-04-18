
package Activites;


public class CShape {
    int size = 2;
    char pattern = '^';
    
    public void draw(){
        for (int i = 1; i <= size; i++) {
            System.out.print(pattern);
        }
        System.out.println();
    }
}


package Activites;


public class CShapeHorizontal {
    
    int size = 10;
    char pattern = '&';
    
    public void draw(){
        for (int i = 1; i <= size; i++) {
            System.out.print(pattern);
        }
        System.out.println();
    }
}

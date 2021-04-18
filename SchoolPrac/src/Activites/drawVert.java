package Activites;

public class drawVert {

    int size = 2;
    String pattern = "*";

    public void drawVert() {
        for (int i = 1; i <= size; i++) {
            System.out.print(pattern);
        }
        System.out.println();
    }
}

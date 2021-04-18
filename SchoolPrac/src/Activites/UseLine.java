
package Activites;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class UseLine {
    public static void main(String[] args) {
        drawVert stripe = new drawVert();
        stripe.drawVert();
        stripe.size = parseInt(JOptionPane.showInputDialog("Enter the size"));
        stripe.pattern = JOptionPane.showInputDialog("Enter the pattern");
        stripe.drawVert();
        stripe.size = 5;
        stripe.drawVert();
        stripe.pattern = "&";
        stripe.drawVert();
    }
}
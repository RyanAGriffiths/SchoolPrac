package ReusableClasses;

import java.util.Scanner;

public class StringBean {

    private String str;

    public StringBean(String s) {
        this.str = s;

    }

    public String getStr() {
        return str;
    }

    public void setStr(String s) {
        this.str = s;
    }

    public String toString() {
        return str + "";
    }

    public int countWords() {
        int num = 0;
        Scanner sc = new Scanner(str).useDelimiter(" ");
        while (sc.hasNext()) {
            sc.next();
            num++;
        }

        return num;
    }

    public String firstCaps() {
        String output = "";

        Scanner sc = new Scanner(str);
        while (sc.hasNext()) {
            String next = sc.next();
            output += next.substring(0, 1).toUpperCase() + next.substring(1) + " ";

        }
        return output;
    }
}

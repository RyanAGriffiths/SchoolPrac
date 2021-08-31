package ObjectArrays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Friend {

    private String name;
    private Date dob;

    public Friend(String n, String d) {
        name = n;
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            dob = s.parse(d);
        } catch (ParseException ex)
        {
            System.out.println("uh oh...");
        }
        
    }
    
    
    public String getName() {
        return name;
    }

    public int getAge() {
        Date today = new Date();
        return today.getYear() - this.dob.getYear();
    }

    public void setName(String n) {
        name = n;
    }

    public int compareTo(Friend b){
        
        return this.name.compareTo(b.getName());
    }

    public String toString() {
        return name + " " + dob.toString();
    }
}

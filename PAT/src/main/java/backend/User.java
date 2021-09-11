package backend;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User
{

    private String password;
    private String email;

    public User(String password, String email)
    {

        this.password = password;
        this.email = email;

    }

    public void setEmail()
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


    public boolean checkPassword(String n)
    {

        return this.password.equals(n);
    }

    public boolean checkEmail(String n)
    {

        return this.email.equals(n);
    }

    public void sendEmail(String email)
    {

    }

}

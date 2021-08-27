package IO_ScannersAndPrintWriters;

public class Logs
{

    String firstname;
    String surname;
    String username;
    String password;
    String email;

    public Logs(String firstname, String surname, String username, String password, String email)
    {
        this.firstname = firstname;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String toString()
    {
        return firstname + " " + surname + " " + username + " " + password + " " + email;
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DVT;

import java.util.Date;

/**
 *
 * @author Ryang
 */
public class Appointment
{

    private String name, surname, id;
    private boolean gender;
    private int age;
    private Date date;

    public Appointment(String name, String surname, String id, boolean gender, int age, Date date)
    {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.date = date;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public boolean isGender()
    {
        return gender;
    }

    public void setGender(boolean gender)
    {
        this.gender = gender;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public boolean isPresent(String n)
    {
        boolean rtrn;
        if (n.isEmpty())
        {
            rtrn = false;
        } else
        {
            rtrn = true;
        }
        return rtrn;
    }

    public boolean isStringValid(String n)
    {
        boolean rtrn = false;
        if (this.isPresent(n))
        {
            for (int i = 0; i < n.length(); i++)
            {
                if (n.charAt(i))
                {
                    
                }
            }
        }else{
            rtrn = false;
        }
        return rtrn;
    }
    
    public boolean 
}

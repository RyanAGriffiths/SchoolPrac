/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Ryang
 */
public class Pirate
{

    private String firstname, surname, deck, job;
    private int grog, limbs;

    public Pirate(String firstname, String surname, String deck, String job, int grog, int limbs)
    {
        this.firstname = firstname;
        this.surname = surname;
        this.deck = deck;
        this.job = job;
        this.grog = grog;
        this.limbs = limbs;
    }

    public String getDeck()
    {
        return deck;
    }

    public String getJob()
    {
        return job;
    }

    public int getLimbs()
    {
        return limbs;
    }

    public void setDeck(String deck)
    {
        this.deck = deck;
    }

    public void setJob(String job)
    {
        this.job = job;
    }

    public String getName()
    {
        return surname + " " + firstname.substring(0, 1) + ".";
    }

    public double grogToMilli()
    {
        return (this.grog * 350);
    }

    public String toString()
    {
        return "Name: " + getName() + "\nDeck: " + getDeck() + "\nJob: " + getJob() + "\nFlagons: " + grog + "\nLimbs: " + limbs;
    }
}

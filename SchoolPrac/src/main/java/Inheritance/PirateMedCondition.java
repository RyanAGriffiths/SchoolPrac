/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Ryang
 */
public class PirateMedCondition extends Pirate
{

    private String med;

    public PirateMedCondition(String med, String firstname, String surname, String deck, String job, int grog, int limbs)
    {
        super(firstname, surname, deck, job, grog, limbs);
        this.med = med;
    }

    public double grogToMilli()
    {
        return super.grogToMilli() + 500;
    }
}

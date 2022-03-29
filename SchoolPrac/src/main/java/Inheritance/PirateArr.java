/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import java.util.Scanner;

/**
 *
 * @author Ryang
 */
public class PirateArr
{

    private Pirate pArrrrrrr[] = new Pirate[50];
    private int size;

    public PirateArr()
    {
        Scanner sc = new Scanner("C:\\Users\\Ryang\\Documents\\NetBeansProjects\\Pirate.txt");
        while (sc.hasNext())
        {

            String line = sc.next();
            Scanner lsc = new Scanner(line).useDelimiter(",");

            String surname = lsc.next();
            String firstname = lsc.next();
            String deck = lsc.next();
            String job = lsc.next();
            int grog = lsc.nextInt();
            int limbs = lsc.nextInt();

            if (lsc.hasNext())
            {
                String medicalCondition = lsc.next();
                pArrrrrrr[size] = new PirateMedCondition(medicalCondition, firstname, surname, deck, job, grog, limbs);
                size++;
            } else
            {
                pArrrrrrr[size] = new Pirate(firstname, surname, deck, job, grog, limbs);
                size++;
            }
            lsc.close();
        }
        sc.close();
    }

    public String toString()
    {
        String output = "";
        for (int i = 0; i < size; i++)
        {
            output += pArrrrrrr[i] + " ";
        }
        return "Pirates:\n" + output;
    }

    public String toStringMedicalCondition()
    {
        String output = "";
        for (int i = 0; i < size; i++)
        {
            if (pArrrrrrr[i] instanceof PirateMedCondition)
            {
                pArrrrrrr[i].toString();
            }
        }
        return output;
    }

    public void bubbleSort()
    {
        for (int j = 0; j < size; j++)
        {
            for (int i = j + 1; i < size; i++)
            {
                if (pArrrrrrr[i].getName().compareTo(pArrrrrrr[j].getName()) > 0)
                {
                    Pirate temp = pArrrrrrr[i + 1];
                    pArrrrrrr[i + 1] = pArrrrrrr[i];
                    pArrrrrrr[i] = temp;

                }
            }
        }
    }

    public int distance(double barrels)
    {
        double grogsOnBoard = barrels * 1000;
        double drank = 0;
    }
}

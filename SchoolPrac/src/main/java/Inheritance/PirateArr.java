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

    private Pirate pArr[] = new Pirate[50];
    private int size;

    public PirateArr()
    {
        Scanner sc = new Scanner("C:\\Users\\Ryang\\Documents\\NetBeansProjects\\Pirate.txt");
        while (sc.hasNext())
        {
            
            String line = sc.next();
            Scanner lsc = new Scanner(line).useDelimiter(","); 
            
            
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**

 @author Ryang
 */
public class Test
{

    public static void main(String[] args)
    {
        UserArray p = new UserArray();
        System.out.println(p.toString());
        System.out.println(p.checkUser("ryanG@gmail.com", "12345"));
    }
}

package Strings;
public class containsPractice 
{
    public static void main(String[] args) 
    {
        String input = "Yo what's up";
        int output = 0;
        
        for(int i = 0; i < input.length(); i++)
        {
            if (input.contains("o"))
                output++;
        }
            System.out.println(output);
    }
}
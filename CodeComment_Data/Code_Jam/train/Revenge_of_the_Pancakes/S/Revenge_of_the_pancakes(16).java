package methodEmbedding.Revenge_of_the_Pancakes.S.LYD360;

import java.util.*;
import java.io.*;
/**
 * Write a description of class Revenge_of_the_pancakes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Revenge_of_the_pancakes
{
    public static void main(String[]args)
    {
        try{
            Scanner reader=new Scanner(new File("pan.in"));
            int cases=reader.nextInt();
            reader.nextLine();
            for(int caase=1; caase<=cases;caase++)
            {
                System.out.print("Case #"+caase+": ");
                String s=reader.nextLine();
                int count=0;
                for(int x=0;x<s.length()-1;x++)
                {
                    if(s.charAt(x)!=s.charAt(x+1))
                        count++;
                }
                if(s.charAt(s.length()-1)=='-')
                    count++;
                System.out.println(count);
            }
        }catch(Exception e){System.out.println(e);}
    }
}

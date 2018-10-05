package methodEmbedding.Speaking_in_Tongues.S.LYD1663;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * ***************************************************************************
 * Created by IntelliJ IDEA.
 * User: Narender Singh Pal
 * Date: 4/14/12
 * Time: 2:55 PM
 * <p/>
 * ***************************************************************************
 * <p/>
 * Copyright (c) 2012 All Rights Reserved.
 * <p/>
 * <p/>
 * ***************************************************************************
 */
public class SpeakingInTongues
{
    public static void main (String args[])
    {
        try
        {
            BufferedReader Br = new BufferedReader(new FileReader("C:\\Input\\A-small-attempt0.in"));
            BufferedWriter Bw = new BufferedWriter(new FileWriter("C:\\Input\\A-small-attempt0.out"));
            try
            {
                //read number if test cases
                int $TC = Integer.valueOf(Br.readLine());
                System.out.println("Number of Test Cases :"+ $TC);
                //Googlerese translation mapping
                Map <Character, Character> GooglereseMapping = new HashMap<Character, Character>();
                GooglereseMapping.put('a','y');
                GooglereseMapping.put('b','h');
                GooglereseMapping.put('c','e');
                GooglereseMapping.put('d','s');
                GooglereseMapping.put('e','o');
                GooglereseMapping.put('f','c');
                GooglereseMapping.put('g','v');
                GooglereseMapping.put('h','x');
                GooglereseMapping.put('i','d');
                GooglereseMapping.put('j','u');
                GooglereseMapping.put('k','i');
                GooglereseMapping.put('l','g');
                GooglereseMapping.put('m','l');
                GooglereseMapping.put('n','b');
                GooglereseMapping.put('o','k');
                GooglereseMapping.put('p','r');
                GooglereseMapping.put('q','z');
                GooglereseMapping.put('r','t');
                GooglereseMapping.put('s','n');
                GooglereseMapping.put('t','w');
                GooglereseMapping.put('u','j');
                GooglereseMapping.put('v','p');
                GooglereseMapping.put('w','f');
                GooglereseMapping.put('x','m');
                GooglereseMapping.put('y','a');
                GooglereseMapping.put('z','q');
                GooglereseMapping.put(' ',' ');

                //For each test case get the Googlerese string and translate to normal string
                for(int tc=1; tc <=$TC; tc++)
                {
                    String $InputStr = Br.readLine();
                    System.out.print("Case #"+ tc +": ");
                    Bw.write("Case #"+ tc +": ");
                    for(int i = 0; i < $InputStr.length(); i++)
                    {
                        Character letter = $InputStr.charAt(i);
                        String $OutputStr = String.valueOf(GooglereseMapping.get(letter));
                        System.out.print($OutputStr);
                        Bw.write($OutputStr);
                    }
                    System.out.println();
                    Bw.write('\n');
                }
            }
            finally
            {
                Br.close();
                Bw.close();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


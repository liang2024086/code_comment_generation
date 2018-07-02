package methodEmbedding.Speaking_in_Tongues.S.LYD1245;

import java.util.*;

public class Translate
{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int counter = 1;

        char to[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                       'o','p','q','r','s','t','u','v','w','x','y','z',' ','*'};

        char from[] = {'y','n','f','i','c','w','l','b','k','u','o','m','x','s',
                       'e','v','z','p','d','r','j','g','t','h','a','q',' ','*'};

        String inputStr;
        input.nextLine();
        while((inputStr = input.nextLine().toLowerCase())!=null)
        {

            String outputStr = "";

            for(int i=0; i<inputStr.length(); i++)
            {
                int j;
                char newChar;
                for(j = 0; j<from.length; j++)
                {
                    if(inputStr.charAt(i) == from[j]) { break; }
                }

                if(j>=27) { System.out.println("Invalid char in input"); }

                outputStr = outputStr + to[j];


            }

            System.out.println("Case #"+counter+": " + outputStr);
            counter++;
        }

    }
}

// Used known letter mappings
// and frequency analysis from:
// http://larry.israel.name/webdev/letterfrequency.html
// and applying standard cryptogram solver techniques from Simon Signh's
// Code Book: http://simonsingh.net/books/the-code-book/
//
// Run using: java Translate < input.in > output.txt

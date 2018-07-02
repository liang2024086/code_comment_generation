package methodEmbedding.Speaking_in_Tongues.S.LYD1019;

/*
Problem

We have come up with the best possible language here at Google, called Googlerese. To translate text into Googlerese, we take any message and replace each English letter with another English letter. This mapping is one-to-one and onto, which means that the same input letter always gets replaced with the same output letter, and different input letters always get replaced with different output letters. A letter may be replaced by itself. Spaces are left as-is.

For example (and here is a hint!), our awesome translation algorithm includes the following three mappings: 'a' -> 'y', 'o' -> 'e', and 'z' -> 'q'. This means that "a zoo" will become "y qee".

Googlerese is based on the best possible replacement mapping, and we will never change it. It will always be the same. In every test case. We will not tell you the rest of our mapping because that would make the problem too easy, but there are a few examples below that may help.

Given some text in Googlerese, can you translate it to back to normal text?
Solving this problem

Usually, Google Code Jam problems have 1 Small input and 1 Large input. This problem has only 1 Small input. Once you have solved the Small input, you have finished solving this problem.
Input

The first line of the input gives the number of test cases, T. T test cases follow, one per line.

Each line consists of a string G in Googlerese, made up of one or more words containing the letters 'a' - 'z'. There will be exactly one space (' ') character between consecutive words and no spaces at the beginning or at the end of any line.
Output

For each test case, output one line containing "Case #X: S" where X is the case number and S is the string that becomes G in Googlerese.
Limits

1 ??? T ??? 30.
G contains at most 100 characters.
None of the text is guaranteed to be valid English.
Sample
Input
3
ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv


Output
Case #1: our language is impossible to understand
Case #2: there are twenty six factorial possibilities
Case #3: so it is okay if you want to just give up
*/


/**
 *
 * @author Scott Moore
 * samoore1@gmail.com
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class CodeJam2012_Qualifying1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //***************************************
        //Declare File I/O variables
        FileReader fr = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        Scanner s = null;
        Scanner sample = null;
        //***************************************
        
        //***************************************
        //Declare Problem Variables
        int T, Ei, Gi, x, y, f, j, h;
        String Eng, Goo;
        char a, e, g;
        char [] E = new char [27]; //English translation
        char [] G = new char [27]; //Googlerese key
        
        int k;
        int count;
        //***************************************
        
        //***************************************
        //initialize English array
        a='a';
        for (x=1;x<=26;x++)
        {
            E[x]=a;
            a++; 
        }
        //***************************************
        
        try {
            //***************************************
            //Read translation matrix from sample file
            sample = new Scanner(new BufferedReader(new FileReader("sample.txt")));
            T = sample.nextInt();
            sample.nextLine(); //advance to next line after T
            
            for (x=1; x <= T; x++)
            {    
                Goo = sample.nextLine();
                Eng = sample.nextLine();
//                for (y = 0; y<=Goo.length()-1; y++)
//                {
                //***************************************
                //find char from english phrase in E array to fill G array
                    for (j=0; j<=Eng.length()-1; j++)
                    {
                        
                        e = Eng.charAt(j);
                        for (h = 1; h<=26; h++)
                        {
                            if (e == E[h])
                            {
                                G[h] = Goo.charAt(j);
                                h = 27;
                            }    
                        }
                        
                    }
                //***************************************    
//                }
            }
            sample.close();
            //***************************************
            
            
            //***************************************
            //Setup file i/o
            s = new Scanner(new BufferedReader(new FileReader("input.txt")));
            fw = new FileWriter ("output.txt");
            pw = new PrintWriter (fw);
            //***************************************
            
            //***************************************
            //set number of problem instances T
            T = 0;
            int i = 1;
            T = s.nextInt(); 
            s.nextLine();
//            s.nextLine();
            //***************************************
            
            for (i = 1; i<= T; i++) { //Loop through problem instances
                //***************************************
                //Initialize instance variables
                Eng = "";
                //***************************************
                
                //***************************************
                //Read input from file
                Goo = s.nextLine();                
                //***************************************
                    
                //***************************************
                //problem logic
                for (Gi=0; Gi<=Goo.length()-1; Gi++)
                {

                    g = Goo.charAt(Gi);
                    if (g == ' ')
                    {
                        Eng = Eng + g;
                    }
                    else 
                    {
                        for (h = 1; h<=26; h++)
                        {
                            if (g == G[h])
                            {
                                Eng = Eng + E[h];
                                h = 27;
                            }    
                        }
                    }
                }                
                //***************************************    
                
                //***************************************
                //print output to file
                pw.print("Case #");
                pw.print(i);
                pw.print(": ");
                pw.print (Eng);  // print solution
                pw.println();
                //***************************************
                
            }
        //***************************************
        //close output file
        } finally {
            pw.close();
        //***************************************    
        }        
    }
}

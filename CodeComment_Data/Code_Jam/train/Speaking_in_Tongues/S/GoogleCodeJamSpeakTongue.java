package methodEmbedding.Speaking_in_Tongues.S.LYD1149;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;

/**
 *
 * @author Aaron
 */
public class GoogleCodeJamSpeakTongue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
        
        String r1 = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
        
        char [] translation = new char [26];
        for (int i = 0; i < 26; i++)
            translation[i] = (char)(i + 'a');
        
        int len = s1.length ();
        for (int i = 0; i < len; i++)
        {
            char a1 = s1.charAt(i);
            char a2 = r1.charAt(i);
            if (a1 != ' ')
                translation[a1- 'a'] = a2;
        }
        
        translation['q'- 'a'] = 'z';
        translation['z'- 'a'] = 'q';
        
        for (int i = 0; i < 26; i++)
        {
            if (translation[i] == (char)(i + 'a'))
                System.out.println ( (char)(i+'a') + "=> *");
            else
                System.out.println ( (char)(i+'a') + "=>" + translation[i]);
        }
        
        try
        {
        
            File file = new File ("input.txt");
            
            PrintWriter pw = new PrintWriter (new FileWriter ("output.txt"));               
                                
            if (file.exists ())
            {
                FileReader f_rd = new FileReader (file);
                LineNumberReader l_rd = new LineNumberReader(f_rd);
                String input_s;                
                
                ArrayList <Integer> result_list = new ArrayList<Integer> ();
                
                input_s = l_rd.readLine();
                int num_case;
                
                 if (input_s!= null)
                 {
                    num_case = Integer.parseInt (input_s);
                } else 
                 {
                    throw new IllegalArgumentException("Invalid Input File");
                }

                 
                for (int i = 0; i< num_case;i++)
                {
                    //read the input file
                    input_s = l_rd.readLine();
                    int s_len =input_s.length();
                    char [] char_array = new char [s_len];
                    for ( int j = 0; j< s_len; j++)
                    {
                         if (input_s.charAt(j) != ' ')
                            char_array[j] = translation[input_s.charAt(j) - 'a'];
                         else
                             char_array[j] = ' ';
                    }
                    
                    String r_str = new String(char_array);
                    //write the data
                    //for (int i = 0; i < result_list.size();i++)
               
                   pw.println ("Case #"+ (i+1)+": " + r_str);                   
               
                }//end of num_case
                
                pw.close();
                
                l_rd.close ();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        
    }
}

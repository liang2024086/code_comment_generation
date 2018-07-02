package methodEmbedding.Speaking_in_Tongues.S.LYD1190;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author Wouter
 */
public class SpeakingInTongues  {

    ArrayList<String> cases = new ArrayList<String>();


   
    public SpeakingInTongues() {


        HashMap<Character,Character> mappingsDecode = new HashMap<Character, Character>();
        HashMap<Character,Character> mappingsEncode = new HashMap<Character, Character>();

        String in = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
        String outS = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";

        char[] cIn = in.toCharArray();
        char[] cOut = outS.toCharArray();

        for(int x = 0;  x<cIn.length; x++)
        {
            mappingsDecode.put(cIn[x], cOut[x]);
            mappingsEncode.put(cOut[x], cIn[x]);
        }

        mappingsDecode.put('z', 'q');
        mappingsDecode.put('q', 'z');
        mappingsEncode.put('q', 'z');
        mappingsEncode.put('z', 'q');


        try {
            // Setup in/out
            System.setIn(new FileInputStream("C:\\GCJ\\A-small-attempt0.in"));
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\GCJ\\A-small-attempt0.out"));
             bw.flush();



            int untill = Integer.parseInt(br.readLine());

            for(int x = 1; x<= untill; x++)
            {
               
               String s = br.readLine();
               String output = "";
               char[] input = s.toCharArray();
               for(int i =0; i < input.length ; i++)
               {
                   output += mappingsDecode.get(input[i]);
               }
                String  out = "Case #" + x + ": "  +output;
              
                cases.add(out);

            }

            for(String s : cases)
            {
                System.out.println(s);
               bw.write(s);
               bw.flush();
               bw.newLine();
            }

        } catch (IOException ex) {
            System.out.println("SOMETHING WENT WRONG");
        }

    }


    public static void main(String[] args) {
        new SpeakingInTongues();
    }



}

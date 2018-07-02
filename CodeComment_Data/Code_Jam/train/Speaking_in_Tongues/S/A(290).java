package methodEmbedding.Speaking_in_Tongues.S.LYD877;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import custom.Output;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author shyam
 */
public class A {
    static String inputfile="./src/Small.in";
    static String outputfile="./src/Small.out";
    //static String inputfile="./src/Large.in";
    //static String outputfile="./src/Large.out";

     public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new FileReader(inputfile));
        PrintWriter pw = new PrintWriter(new FileWriter(outputfile));

        String row="";
        String row2="";
        StringTokenizer st;

        char[] E = new char[256];
        E['a'] = 'y';
        E['b'] = 'h';
        E['c'] = 'e';
        E['d'] = 's';
        E['e'] = 'o';
        E['f'] = 'c';   //
        E['g'] = 'v';
        E['h'] = 'x';
        E['i'] = 'd';
        E['j'] = 'u';
        E['k'] = 'i';
        E['l'] = 'g';
        E['m'] = 'l';
        E['n'] = 'b';
        E['o'] = 'k';
        E['p'] = 'r';
        E['q'] = 'z';
        E['r'] = 't';
        E['s'] = 'n';
        E['t'] = 'w';
        E['u'] = 'j';
        E['v'] = 'p';
        E['w'] = 'f';
        E['x'] = 'm';
        E['y'] = 'a';
        E['z'] = 'q';   //

        // first line to count no of records
        row=br.readLine();
        int T=Output.ipri(row);

        
        // initial variables

        for(int count=1;count<=T;count++){
            row=br.readLine(); // read each record
            // tokenize: default space
            st=new StringTokenizer(row);

            // variables
            String G="";
            // operations

            for(int i=0;i<row.length();i++){
                if(row.charAt(i) == ' ')
                    G+=" ";
                else G+=""+E[row.charAt(i)];
            }



            // printing output
            Output.sopl("Case #"+count+": "+G);
            pw.println("Case #"+count+": "+G);


            // reset variables

        }



        br.close();
        pw.close();
    }

}

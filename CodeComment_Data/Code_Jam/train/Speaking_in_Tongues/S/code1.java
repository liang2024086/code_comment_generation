package methodEmbedding.Speaking_in_Tongues.S.LYD1021;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author admin
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {



        int N,summap=0,sumletters=0;
        char[] map= new char[26];
        for (int i=0; i<map.length;i++) map[i]='0';
        String test1="ejp mysljylc kd kxveddknmc re jsicpdrysi";
        String test2="rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
        String test3="de kr kd eoya kw aej tysr re ujdr lkgc jv";
        String result1="our language is impossible to understand";
        String result2="there are twenty six factorial possibilities";
        String result3="so it is okay if you want to just give up";
     
        for (int i=0; i<test1.length();i++){
            int rank=(int)test1.charAt(i)-97;
            if (rank==-65) continue;
            map[rank]=result1.charAt(i);
            
        }

        for (int i=0; i<test2.length();i++){
            int rank=(int)test2.charAt(i)-97;
            if (rank==-65) continue;
            map[rank]=result2.charAt(i);
            
        }

        for (int i=0; i<test3.length();i++){
            int rank=(int)test3.charAt(i)-97;
            if (rank==-65) continue;
            map[rank]=result3.charAt(i);
            
        }

        int q = (int)'q';
        map[q-97]='z';



        String line= new String();
        for (int i=0;i<map.length;i++){
            if (map[i]!='0')
            summap+=map[i];
        }
        for (char a='a';a<='z';a++){

            sumletters+=(int)a;
        }

        //System.out.println(summap+" "+sumletters);
        //System.out.println(sumletters-summap);
        char lost=(char)(sumletters-summap);
       // System.out.println(lost);
        for (int i=0;i<map.length;i++){
            if (map[i]=='0') map[i]='q';
                }


  /*     for (int i=0;i<map.length;i++){
            
            System.out.println((char)(i+97)+"     =>    "+i+"    =>    "+map[i]);
        }
*/

        Scanner st = new Scanner(new File("/2012A-small.in"));

        N =st.nextInt();

        //System.out.println(N);
        line=st.nextLine();

        for (int i=0;i<N;i++){

            line=st.nextLine();
            System.out.print("Case #"+(i+1)+": ");
            for (int j=0;j<line.length();j++){
                if (line.charAt(j)==' ') System.out.print(" ");
                else
                System.out.print(map[(int)line.charAt(j)-97]);
            }
            System.out.println();

        }

        System.out.println();
    }
}



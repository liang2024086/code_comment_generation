package methodEmbedding.Standing_Ovation.S.LYD1180;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;

/**
 *
 * @author ciber_000
 */
public class StandingOvation {

    public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File("A-small-attempt0.in");
        PrintWriter writer = new PrintWriter("A.out", "UTF-8");
        //writer.println("The first line");
        //writer.println("The second line");
        try {

            Scanner sc = new Scanner(file);
            int t=sc.nextInt();
            int caso=1;
            while (sc.hasNextLine()) {
                int sMax=sc.nextInt();
                String s = sc.nextLine();
                s=s.substring(1);
                int shy[]=new int[sMax+1];
                for (int i = 0; i < shy.length; i++) {
                    shy[i]=Integer.parseInt(Character.toString(s.charAt(i)));
                }
                int result=0;
                int pClap=0;
                for (int i = 0; i < shy.length; i++) {
                    if(i<=pClap)pClap+=shy[i];
                    else{
                        ++result;
                        pClap+=shy[i]+1;
                        //System.out.println(caso+":"+pClap);
                    }
                }
                writer.println("Case #"+(caso++)+": "+result);
            }
            sc.close();   
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package methodEmbedding.Speaking_in_Tongues.S.LYD42;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class G1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) throws IOException {
         String to = "yhesocvxduiglbkrztnwjpfmaq";
         int t;
         int n=0;
         String []G;
         String []F;
    
         FileReader fin = new FileReader("A-small-attempt1.in");
         Scanner src = new Scanner(fin);
         t= src.nextInt();
         G = new String[t];
         F = new String[t];
            src.nextLine();
         for (int i = 0;i<t;i++){
             G[i]=src.nextLine();
         }
//        while (src.hasNext())
//        {
//            G[n] = src.nextLine();
//            n++;
//        }
	fin.close();
        
        //manipulate
        int temp;
         for (int i = 0;i<t;i++){
             F[i]="";
             for (int j = 0;j<G[i].length();j++) {
                 temp = (int)G[i].charAt(j) -96;
                 if (temp == -64)
                    F[i]+=" ";
                 else
                     F[i]+=to.charAt(temp-1);
             }
         }
        for (int i=0;i<t;i++){
            System.out.println("Case #"+ (i+1) + ": " + F[i]);
        }
  }
}

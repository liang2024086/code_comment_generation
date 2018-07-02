package methodEmbedding.Standing_Ovation.S.LYD2142;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author Nima
 */
public class CodeJamA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Scanner sc=new Scanner(new File("C:\\Users\\Nima\\Downloads\\A-small-attempt1.in"));
        int testCase=sc.nextInt();
        FileWriter w=new FileWriter("C:\\Users\\Nima\\Downloads\\A-small-attempt1.out");
        for(int i=0;i<testCase;i++){
            int sMax=sc.nextInt();
            String number=sc.nextLine().trim();
            int numberI[]=new int[sMax+1];
            for(int j=0;j<numberI.length;j++){
                numberI[j]=number.charAt(j)-'0';
            }
            int stands=0;
            int shouldStand=0;
            for(int j=0;j<numberI.length;j++){
                if(j<=stands){
                    
                        for (int k = 0; k < numberI[j]; k++) {
                            stands++;
                        }
                    
                }else{
                    for (int k = stands; k < j; k++) {
                        stands++;
                        shouldStand++;
                    }
                    j--;
                }
            }
            
            w.write("Case #"+(i+1)+": "+shouldStand+"\n");
           
        }
        w.close();
    }
    
}

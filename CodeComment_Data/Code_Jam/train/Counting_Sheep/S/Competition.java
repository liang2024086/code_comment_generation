package methodEmbedding.Counting_Sheep.S.LYD1540;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fast
 */
public class Competition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File input = new File("A-small-attempt0.in");
        File output = new File("output_file.txt");
        FileWriter fw = new FileWriter(output);
        BufferedWriter bw = new BufferedWriter(fw);
        int count[];  
        int cases=1;
        Scanner in = new Scanner(input);
        int T = in.nextInt();
        if(!output.exists())
        {
            output.createNewFile();
        }
        while(cases!=T+1)
        {
        count = new int[10];
        count[0]=1;
        int sum=0;
        int b;
        int mul=1;
        int y=0;
        int a = in.nextInt();
        int c=a;
        if(c!=0)
        {
        while(sum!=45)
        {
           y=c;
           sum=0;
           while(c>0)
           {
           b = c%10;
           count[b]=b;
           c=c/10;
           }
           for(int i=0;i<10;i++)
           {
               sum=sum+count[i];
           }
           c=a;
           c=c*mul;
           mul++;
        }
        bw.write("Case #"+cases+": "+y);
        bw.newLine();
        cases++;
        }
        else
        {
         bw.write("Case #"+cases+": "+"INSOMNIA");
         bw.newLine();
         cases++;
        }
        }
        bw.close();
                
    }
    
}

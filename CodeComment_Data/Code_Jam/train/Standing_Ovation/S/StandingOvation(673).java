package methodEmbedding.Standing_Ovation.S.LYD200;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liam
 */
public class StandingOvation
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        File file = new File("C:\\Users\\Liam\\Documents\\A-small-attempt5.in");
        File outFile = new File("C:\\Users\\Liam\\Documents\\A-small-attempt1.out");
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
        int testCases = Integer.parseInt(br.readLine());
        
        for (int j=0; j<testCases;j++)
        {
            String n=br.readLine();
            
            int smax=n.charAt(0)-48;
            int size=0;
            int count=0;
            
            int ShyLevel=1;
            String audience=n.substring(2);
            int NumStanding=audience.charAt(0)-48;
            for(int k=0;k<=smax;k++)
            {
                size=size+audience.charAt(k)-48;
            }
            while(NumStanding<size)
            {
                if(NumStanding>=ShyLevel)
                {
                    NumStanding=NumStanding+audience.charAt(ShyLevel)-48;
                    ShyLevel++;
                }
                else
                {
                    count++;
                    NumStanding++;
                    size++;
                }
            }
            System.out.println(NumStanding);
            System.out.println("Case #"+(j+1)+": "+count);
            System.out.println("");
            bw.write("Case #"+(j+1)+": "+count);
            bw.newLine();
            
        }
        
        br.close();
        bw.close();
    }
}

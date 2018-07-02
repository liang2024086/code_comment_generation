package methodEmbedding.Standing_Ovation.S.LYD1892;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Rishab
 */
public class Main
{
    public static void main(String[] args)
    {
    try
    {
        File in = new File("C:\\Users\\Rishab\\Downloads\\A-small-attempt3.in");
        File out = new File("C:\\Users\\Rishab\\Downloads\\out.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(out)); 
        Scanner sc= new Scanner(in);
        int tc = sc.nextInt();
        int noFri,maxShy, stood, diff;
        char ppl[];
        for(int i=1; i<=tc; i++)
        {
            noFri=stood=diff=0;
            maxShy = sc.nextInt();
            ppl = new char[maxShy+1];
            ppl = sc.next().toCharArray();
            System.out.println(ppl);
            stood = stood + Integer.parseInt(Character.toString(ppl[0]));
            
            for(int j=1; j<=maxShy; j++)
            {
                diff=0;
                if(j>stood)
                {
                    diff=j-stood;
                    noFri = noFri + diff;
                }
                stood = stood + Integer.parseInt(Character.toString(ppl[j])) + diff;
            }    
            
            bw.write("Case #" + i +": " + noFri +"\r\n");
        }  
        bw.flush();
        bw.close();
        sc.close();
    }catch(Exception e){
        System.out.println(e);
    }    
    }        
}

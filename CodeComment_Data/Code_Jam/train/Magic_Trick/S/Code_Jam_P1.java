package methodEmbedding.Magic_Trick.S.LYD1931;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Asad
 */
public class Code_Jam_P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String file ="A-small-attempt2.in";
        String outputfile="output.txt";
        int tprob;
        int ans1;
        int ans2;
        int [][]Arr1=new int[4][4];
        int [][]Arr2=new int[4][4];
        int element=0;
        try
        {
            InputStream ips=new FileInputStream(file);
               InputStreamReader ipsr=new InputStreamReader(ips);
            BufferedReader br=new BufferedReader(ipsr);
            
            FileWriter fw = new FileWriter (outputfile);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter fileOut = new PrintWriter (bw);
            
            String Line;
            tprob=Integer.parseInt(br.readLine());
            System.out.println("Total Number of Problems are "+ tprob);
            for(int i=0;i<tprob;i++)
            {
                int counter=0;
                ans1=Integer.parseInt(br.readLine());
                for(int j=0;j<4;j++)
                {
                    String line=br.readLine();
                    String [] words = line.split(" ");
                    for(int k=0;k<4;k++)
                    {
                        Arr1[j][k]=Integer.parseInt(words[k]);
                    }
                    
                }
                    ans2=Integer.parseInt(br.readLine());
                for(int j=0;j<4;j++)
                {
                    String line=br.readLine();
                    String [] words = line.split(" ");
                    for(int k=0;k<4;k++)
                    {
                        Arr2[j][k]=Integer.parseInt(words[k]);
                    }
                    
                }
                
                
               for(int l=0;l<4;l++)
                {
                    for(int m=0;m<4;m++)
                    {
                    if(Arr1[ans1-1][l]==Arr2[ans2-1][m])
                    {
                        counter++;
                        element=Arr1[ans1-1][l];
                    }
                    }
                
                }
                    if(counter>1)
                    {
                        System.out.println("Case #"+(i+1)+": Bad magician!");
                        fileOut.println ("Case #"+(i+1)+": Bad magician!"); 
                    }
                    else if(counter==0)
                    {
                        System.out.println("Case #"+(i+1)+": Volunteer cheated!");
                        fileOut.println ("Case #"+(i+1)+": Volunteer cheated!");
                    }
                     else if(counter==1)
                    {
                        System.out.println("Case #"+(i+1)+": "+element);
                       
                        fileOut.println ("Case #"+(i+1)+": "+element);
                        
                    }
                    
            }
            
        /*   for(int x=0;x<4;x++)
            {
                for(int y=0;y<4;y++)
                {
                    System.out.println(Arr2[x][y]);
                }
            }*/
           /* while((Line=br.readLine())!=null)
            {
                String [] words = Line.split(" ");
                System.out.println(Line);
            }*/
            fileOut.close();
            br.close();
            ipsr.close();
            ips.close();
            
        }
        catch(Exception e)
                {
                    System.out.println(e.toString());
                }
    }
}

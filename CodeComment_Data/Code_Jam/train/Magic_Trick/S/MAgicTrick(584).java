package methodEmbedding.Magic_Trick.S.LYD305;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Wolverine
 */
public class MAgicTrick {
    
    int[][] grid1=new int[4][4];
    int [][] grid2=new int[4][4];
    int ans1,ans2,answer;
    public static void main(String [] arg) throws FileNotFoundException, IOException
    {
        MAgicTrick ob= new MAgicTrick();
    int numberOfTestCases=0,count=0,des=0;
   FileReader in=new FileReader("C:\\Users\\wolverine\\Documents\\NetBeansProjects\\Google CodeJam\\src\\google\\codejam\\A-small-attempt0.in");
   BufferedReader br=new BufferedReader(in);
   numberOfTestCases=Integer.parseInt(br.readLine());
        StringTokenizer sr=new StringTokenizer("");
        for (int i = 0; i < numberOfTestCases; i++) 
        {
            des=0;
            ob.ans1=Integer.parseInt(br.readLine());
            for (int j = 0; j < 4; j++) {
                sr=new StringTokenizer(br.readLine()," ");
                count=0;
                    while(sr.hasMoreTokens())
                    {
                         ob.grid1[j][count]=Integer.parseInt(sr.nextToken());
                         count++;
                    }
            }
            ob.ans2=Integer.parseInt(br.readLine());
                        for (int j = 0; j < 4; j++) {
                sr=new StringTokenizer(br.readLine()," ");
                count=0;
                    while(sr.hasMoreTokens())
                    {
                         ob.grid2[j][count]=Integer.parseInt(sr.nextToken());
                         count++;
                    }
            }
                 
                        
                        for (int j = 0; j < 4; j++)
                        {
                            for (int k = 0; k < 4; k++)
                            {
                                  if(ob.grid1[ob.ans1-1][k]== ob.grid2[ob.ans2-1][j])
                                     {
                                      des++;
                                      ob.answer=ob.grid1[ob.ans1-1][k];
                                     }   
                            }
                        }
                      
                        if (des==0)
                        {
                System.out.println("Case #"+(i+1)+": Volunteer cheated!");
                          }
                        else if (des==1)
                        {
                System.out.println("Case #"+(i+1)+": "+ob.answer);
                          }    
                        else
                        {
                            System.out.println("Case #"+(i+1)+": Bad magician!"); 
                        }
                        
        }
    }
}

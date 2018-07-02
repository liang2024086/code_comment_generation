package methodEmbedding.Magic_Trick.S.LYD838;


/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.Scanner;
public class Driver
{
    
    public static void main(String[] args) {
//         if(args.length < 2) {
//             System.out.println("Usage : java CodeJamSolution2 <In File> <Out File>");
//             return;
//         }

        int [][] boardone = new int [4][4];
        int [] tmp1 = new int [4];
        int [] tmp2 = new int [4];
        int [] tmpC = new int [4];
        int [] choices;
        
        int numCases = 0;
        try {
            Scanner in = new Scanner(new FileReader(args[0]));
            PrintWriter out = new PrintWriter(args[1],"UTF-8");
//             Scanner in = new Scanner(new FileReader("in"));
//             PrintWriter out = new PrintWriter("out","UTF-8");
            
            numCases = in.nextInt();
            choices = new int [numCases * 2];
            
            for(int c = 0; c<numCases; c++)
            {
                out.print("Case #" + (c+1) + ": ");
                for(int a = 0; a<4;a++)
                {
                    tmp1[a] = 0;
                    tmp2[a] = 0;
                    tmpC[a] = 0;
                    
                }
                for(int o = 0; o<2; o++)
                {
                    choices[c+o] = in.nextInt();
//                     System.out.println(choices[c+o]);
                    in.nextLine();
                    //get arrays
                    for(int k = 0; k<4; k++)
                    {
                        for(int v = 0; v<4; v++)
                        {
                            boardone[k][v] = in.nextInt();
//                             System.out.println("\t" + boardone[k][v]);
                        }
                        if(c+o == (numCases*2)){
                            in.nextLine();
                        }
                    }
                    for(int i = 0; i<4; i++)        //processing
                    {
                        if(o==0)
                        {
                            tmp1[i] = boardone[choices[c+o]-1][i];
                        }else if (o==1)
                        {
                            tmp2[i] = boardone[choices[c+o]-1][i];
                        }
                    }
                }
                int numFound = 0;
                //arrays are full and you have a choice
                for(int p = 0;p<4;p++)
                {
//                     System.out.println("\t\t\t1" + tmp1[p]);
//                     System.out.println("\t\t\t2" + tmp2[p]);
                    for(int l = 0; l<4; l++)
                    {
                        if(tmp1[p] == tmp2[l])
                        {
//                             System.out.println("\t\t" + tmp1[p] + "==" + tmp2[l]);
                            numFound++;
                            tmpC[p] = tmp1[p];
                        }
                    }
                }
                int whereFound = 0;
                for(int m = 0;m<4;m++)
                {
//                     System.out.println("\t\t" + tmpC[m]);
                    if(tmpC[m]>0)
                    {
                        
                        whereFound = m;
                    }
                    if(m == 3)
                    {
                        if(numFound==1)
                        {
                            out.println(tmpC[whereFound]);
                        }else if(numFound==0)
                        {
                            out.println("Volunteer cheated!");
                        }else
                        {
                            out.println("Bad magician!");
                        }
                    }
                }
                
            }
            in.close();
            out.close();
        } catch (IOException e) {
        }
    }
}

package methodEmbedding.Magic_Trick.S.LYD1295;

import java.util.*;
import java.io.*;

public class magic
{
    public static void main(String[] args)
    {
         
         try
         {
             Scanner myScan = new Scanner(new File("A-small-attempt0.in"));
             PrintWriter myWrite = new PrintWriter(new File("Output.txt"));
             int length = myScan.nextInt();
             int possibilities[] = new int[4];
             int nextRow[] = new int[4];
         for(int i = 1;i<=length;i++)
         { 
             int rowC = myScan.nextInt();
             System.out.println(rowC);
             for(int j = 0;j<4;j++)
             {
                 if(j == rowC-1)
                 {
                     for(int k = 0;k<4;k++)
                     {
                         possibilities[k] = myScan.nextInt();
                         System.out.println(possibilities[k] + "kk");
                      }
                    }
                 else
                 {
                    for(int k = 0;k<4;k++)
                     {
                         int voidsl = myScan.nextInt();
                      }
                 }
             }
                 
                rowC = myScan.nextInt();
                System.out.println(rowC);
                for(int j = 0;j<4;j++)
                {
                 
                    if(j == rowC-1)
                   {
                     for(int k = 0;k<4;k++)
                     {
                         nextRow[k] = myScan.nextInt();
                         System.out.println(nextRow[k]);
                      }
                    }
                  else
                  {
                    for(int k = 0;k<4;k++)
                     {
                         int voidsl = myScan.nextInt();
                      }
                  }
                }
                int possibility = -1;
                for(int j = 0;j<4;j++)
                {
                 
                 if(j == rowC-1)
                 {
                     for(int k = 0;k<4;k++)
                     {
                        boolean found = false;
                         for(int l=0;l<4;l++)
                         {
                            if(possibilities[k] == nextRow[l])
                            {
                                found = true;
                                if(possibility!=-1 || possibility == 928)
                                    possibility = 928;
                                else
                                    possibility = possibilities[k];
                            }
                         }
                         if(!found)
                            possibilities[k] = -999;
                        }
                    }
                    
                }
                
                if(possibility == -1)
                        myWrite.println("Case #" + i + ": Volunteer cheated!");
                    else if(possibility == 928)
                        myWrite.println("Case #" + i + ": Bad magician!");
                    else
                        myWrite.println("Case #" + i + ": " + possibility);
                
         }
            myScan.close();
            myWrite.close();
                     }catch(FileNotFoundException e)
         {
                System.out.println("File not found");
         }
    }
}

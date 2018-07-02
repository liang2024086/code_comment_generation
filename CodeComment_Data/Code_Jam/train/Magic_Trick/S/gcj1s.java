package methodEmbedding.Magic_Trick.S.LYD2117;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class gcj1s 
{
    public static int array_1[][] = new int[4][4];
    public static int array_2[][] = new int[4][4];
    public static int first_pick, second_pick;
    static List l1 = new ArrayList();
    static List l2 = new ArrayList();
    static Set set = new TreeSet();
    public static void main(String[] args) 
   {
        
       String base="C:/Users/Administrator/Dropbox/Desktop/gcj14/magic/";
        String input=base + "s0.in";
        String output=base + "s0.out";  
        try 
        {
            Scanner sc = new Scanner(new FileReader(input));
            PrintWriter pw = new PrintWriter(output); 
            int n = sc.nextInt();
            System.out.println(n);
            
           
            
            for (int c=0; c<n; c++) 
            {
                set.clear();
                l1.clear();
                l2.clear();
                first_pick = sc.nextInt();
                System.out.println(first_pick);
                sc.nextLine();
                for(int i=0;i<4;i++)
                {
                    String row[] = sc.nextLine().split(" ");    
                    for(int j=0;j<4;j++)
                    {
                        System.out.print (row[j] + " ");
                        array_1[i][j] = Integer.parseInt(row[j]);
                    }
                    
                    System.out.println();
                }
                for(int k = 0;k<4;k++)
                {
                set.add(array_1[first_pick-1][k]);
                l1.add(array_1[first_pick-1][k]);
                }
                second_pick = sc.nextInt();
                System.out.println(second_pick);
                sc.nextLine();
                for(int i=0;i<4;i++)
                {
                    String row[] = sc.nextLine().split(" ");    
                    for(int j=0;j<4;j++)
                    {
                        System.out.print (row[j] + " ");
                        array_2[i][j] = Integer.parseInt(row[j]);
                    }
                  System.out.println();
                }
                for(int k = 0;k<4;k++)
                {
                set.add(array_2[second_pick-1][k]);
                l2.add(array_2[second_pick-1][k]);
                }
               
               System.out.println(set);
               if(set.size()==8)
               {
                   pw.println("Case #" + (c+1) + ": "+"Volunteer cheated!");
                   
               }
               else if(set.size()==7)
               {
                   l1.retainAll(l2);
                   pw.println("Case #" + (c+1) + ": "+l1.get(0));
               }
               else
               {
                    pw.println("Case #" + (c+1) + ": "+"Bad magician!");
               }
                              
                
            }
            pw.println();
            pw.flush();
            pw.close();
            sc.close();
        } 
        catch (FileNotFoundException ex) 
        {
            //System.out.println(ex);
        }
        
    }
}

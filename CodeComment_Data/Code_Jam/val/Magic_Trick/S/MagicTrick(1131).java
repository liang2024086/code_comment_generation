package methodEmbedding.Magic_Trick.S.LYD1740;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("A-small.in");
        Scanner fin = new Scanner(file);
        
        int testCases = fin.nextInt();
        
        
        for(int c = 1; c <= testCases; c++)
        {
            int ans1 = (fin.nextInt()-1);
            int grid1[][] = new int[4][4];
            int res[] = new int[4];
            
            for(int i = 0; i < 4; i++)
            {
                for(int j = 0; j < 4; j++)
                {
                    grid1[i][j] = fin.nextInt();
                    
                    if(i == ans1)
                    {
                        for(int k = 0; k < 4; k++)
                        {
                            res[k] = grid1[i][k];
                        }
                    }
                }
            }
            
            int ans2 = (fin.nextInt()-1);
            int grid2[][] = new int[4][4];
            int ans = 0;
            int found = 0;
            
            for(int i = 0; i < 4; i++)
            {
                for(int j = 0; j < 4; j++)
                {
                    grid2[i][j] = fin.nextInt();
                    
                }
                if(i == ans2)
                {
                    for(int k = 0; k < 4; k++)
                    {
                        for(int l = 0; l < 4; l++)
                        {
                            if(grid2[i][k] == res[l])
                            {
                                ans = res[l];
                                found++;
                                
                            }
                        }
                    }
                }
            }
            
            if(found == 0)
            {
                System.out.println("Case #" + c + ": " + "Volunteer cheated!");
            }
            else if(found == 1)
            {
                System.out.println("Case #" + c + ": " + ans);
            }
            else
            {
                System.out.println("Case #" + c + ": " + "Bad magician!");
            }
            
            
        }
        fin.close();
    }
}

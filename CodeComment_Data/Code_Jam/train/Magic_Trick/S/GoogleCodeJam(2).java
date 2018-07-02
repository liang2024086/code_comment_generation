package methodEmbedding.Magic_Trick.S.LYD941;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import static java.lang.Math.*;
/**
 *
 * @author Sean
 */
public class GoogleCodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        
        for(int i = 0; i<T; i++)
        {
           // boolean volCheated = false;
            //boolean badMagician = false;
            ArrayList<Integer> matches = new ArrayList<Integer>();
            int rowA = in.nextInt();
            
            int[][] cardsA = new int[4][4];
            for (int x = 0; x< 4; x++)
            {
                for (int z = 0; z<4; z++)
                {
                    cardsA[x][z] = in.nextInt();
                }
            }
            /*
            System.out.println("rowA:" + rowA);
                        System.out.println("cardsA:");
                        for (int x = 0; x< 4; x++)
            {
                for (int z = 0; z<4; z++)
                {
                    System.out.printf("%d ",cardsA[x][z]);
                }
                System.out.printf("\n");
            }
            */
           int rowB = in.nextInt();
            
            int[][] cardsB = new int[4][4];
            for (int x = 0; x< 4; x++)
            {
                for (int z = 0; z<4; z++)
                {
                    cardsB[x][z] = in.nextInt();
                }
            }
           
           /* System.out.println("rowB:" + rowB);
            System.out.println("cardsB:");
                        for (int x = 0; x< 4; x++)
            {
                for (int z = 0; z<4; z++)
                {
                    System.out.printf("%d ",cardsB[x][z]);
                }
                System.out.printf("\n");
            }
            */
           // System.out.printf("Row A: %d Row B: %d\n",rowA,rowB);
            for(int k = 0; k<4; k++)
            {
                for(int z = 0; z<4; z++)
                {
                   // System.out.printf("a: %d b:%d\n",cardsA[rowA-1][k],cardsB[rowB-1][z]);
                    if(cardsA[rowA-1][k] == cardsB[rowB-1][z])
                    {
                        //System.out.println("TRUE!");
                       //System.out.printf("a: %d b:%d\n",cardsA[rowA-1][k],cardsB[rowB-1][z]);
                       matches.add(cardsA[rowA-1][k]);
                    }
                }
            }
            
            if(matches.size() == 0)
                System.out.format("Case #%d: %s\n", i+1, "Volunteer cheated!");
            else if (matches.size() == 1)
                System.out.format("Case #%d: %d\n", i+1, matches.get(0));
            else if (matches.size() > 1)
                System.out.format("Case #%d: %s\n", i+1, "Bad magician!");
        }
        
        
    }
}

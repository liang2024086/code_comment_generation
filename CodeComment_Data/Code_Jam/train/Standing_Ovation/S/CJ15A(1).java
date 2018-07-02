package methodEmbedding.Standing_Ovation.S.LYD643;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Safa
 */
public class CJ15A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner scan;
        scan = new Scanner( new File ("ovation.txt"));
        // TODO code application logic here
        
        int T = scan.nextInt();
        int sMax;
        int sAll;
        
        for( int i = 0; i < T; i++)
        {
            sMax = scan.nextInt();
            sAll = scan.nextInt();
            int f = 0;
            int sPrev = 0;
            int sCur;
            
            for( int j = 0; j < sMax+1; j++)
            {
                sCur = sAll/(int)(Math.pow(10, sMax-j))%10;
                //System.out.println(sCur);
                if ( sPrev  + f < j)
                  f = f + ( j - sPrev - f);
                sPrev = sPrev + sCur;
                
            }
            
            //System.out.println("--");
            System.out.println("Case #" + (i+1) + ": " + f);
        }

        
    }
}

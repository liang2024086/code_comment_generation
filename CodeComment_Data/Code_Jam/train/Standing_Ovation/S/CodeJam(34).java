package methodEmbedding.Standing_Ovation.S.LYD965;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
/**
 *
 * @author Mian
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        File f = new File("A-small-attempt0.in");
        Scanner s = new Scanner(f);
        
        FileWriter fw  = new FileWriter("A-small.out");
        BufferedWriter bw = new BufferedWriter(fw);
        int caseNo = 0;
        int total = s.nextInt();
        
        for(int i = 0; i < total; i++)
        {
            int index = s.nextInt();
            
            String num = s.nextLine();
            int stand = 0;
            int req = 0;
            for(int j = 0; j <= index; j++)
            {
                int level = num.charAt(j + 1) - 48;
                
                if(j <= stand)
                {
                    stand = stand + level;
                }
                else
                {
                    req = req + (j - stand);
                    stand = stand + level + (j - stand);
                }
            }
            bw.write("Case #" + (i+1) + ": " + req);
            bw.newLine();
            
            
        }
        bw.close();
        fw.close();
        
    }
    
}

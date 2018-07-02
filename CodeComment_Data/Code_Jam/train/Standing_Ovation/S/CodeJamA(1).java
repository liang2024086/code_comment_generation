package methodEmbedding.Standing_Ovation.S.LYD639;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Boris
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader bf = new BufferedReader(new FileReader("A-small-attempt0.in"));
        
        //int T = sc.nextInt();
        int T = Integer.parseInt(bf.readLine());
        
        for( int i = 0; i <T; i++)
        {
            String[] l = bf.readLine().split(" ");
            int n = Integer.parseInt(l[0])+1;
            
            String s = l[1];
            
            int tmp=0;
            int k =0;
            for(int j =0; j<n;j++)
            {
                tmp+= (s.charAt(j)-'0');
                if(tmp<j+1)
                {
                    k+= j+1-tmp;
                    tmp= j+1;
                }
            }
            System.out.printf("Case #%d: %d\n",i+1,k);
        }
        bf.close();
        
    }
    
}

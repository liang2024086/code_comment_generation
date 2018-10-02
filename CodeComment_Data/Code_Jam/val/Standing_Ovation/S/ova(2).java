package methodEmbedding.Standing_Ovation.S.LYD727;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mudit
 */
import java.io.*;


class ova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
    
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
       for(int k=1;k<=t;k++)
        {
            String s = br.readLine();
            String[] ar = s.split(" ");
            
            int max = Integer.parseInt(ar[0]);
            
            String[] as = ar[1].split("");
            
            int[] a  = new int[max+1];
            
            for(int i=0;i<as.length;i++)
            {
               a[i] = Integer.parseInt(as[i]);
            }
            
            int count = a[0];
            int ans = 0;
            
            for(int j=1;j<=max;j++)
            {
                int inc =0;
                   if(j>count)
                   {
                       inc = j-count;
                       ans+= j-count;
                   }
            count+=a[j]+inc;
            }
            
            
            System.out.println("Case #"+k+":"+" "+ans);
            
        }
        
    }
    
}


package methodEmbedding.Standing_Ovation.S.LYD1275;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praveen
 */
public class CJA 
{
    public static void main(String args[])throws Exception
    {
        //BufferedReader br = new BufferedReader(new InputStreamReader ( System.in));
        BufferedReader br = new BufferedReader( new FileReader("A-small-attempt2.in"));
        BufferedWriter write = new BufferedWriter(new FileWriter("ans.txt"));
        int tt = Integer.parseInt(br.readLine()) , n , i , j, k , need , present;
        String s , st[] , ans;
        for ( i = 0 ; i < tt ; i++)
        {
            s = br.readLine();
            st = s.split(" ");
            n = Integer.parseInt(st[0]);
            s = st[1];
            need = 0;
            present = s.charAt(0)-'0';
            ans = "";
            for ( j = 1 ; j <= n ; j++)
            {
                k = s.charAt(j)-'0';
                if ( k != 0)
                {
                    if ( j > present)
                    {
                        need+=(j - present);
                        present+=need;
                    }
                    present+=k;
                }
            }
            ans+="Case #"+(i+1)+": "+need;
            //System.out.println(ans);
            write.write(ans);
            write.newLine();
         }
        br.close();
        write.close();
        
        
    }
}

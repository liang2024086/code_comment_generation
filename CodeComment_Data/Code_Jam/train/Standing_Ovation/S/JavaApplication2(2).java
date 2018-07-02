package methodEmbedding.Standing_Ovation.S.LYD649;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author thiru_000
 */
import java.net.*;
import java.io.*;
import java.util.*;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        Scanner s = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
        int t = s.nextInt();
        
        for(int i=1;i<=t;i++)
        {
            s.nextInt();
            
            String str=s.nextLine();
                        int count = 0;
            int sum = 0;
            for(int j=1;j<str.length() && sum<str.length()-2;j++)
            {
                
                
                
                if(sum<j-1)
                {
                    count+=(j-sum-1);
                    sum=(j-sum-1)+sum;
                }
				sum+=Character.getNumericValue(str.charAt(j));
            }
            out.println("Case #"+i+": "+count);
        
        }
		out.close();
    }
}

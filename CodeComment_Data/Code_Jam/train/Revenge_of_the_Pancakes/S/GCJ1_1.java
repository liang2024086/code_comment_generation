package methodEmbedding.Revenge_of_the_Pancakes.S.LYD109;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
/**
 *
 * @author jay
 */
public class GCJFirst 

{
    public static void main(String args[])throws IOException
    {
        
        try (BufferedReader br = new BufferedReader(new FileReader(new File("/Users/jay/NetBeansProjects/Leetcode/src/leetcode/input.txt")))) {
            String line;
            int count = 0;
            int test = 0;
            while ((line = br.readLine()) != null) {
               // process the line.
                //System.out.println(line);
                if(count==0)
                {
                    count++;
                }
                else
                {
                    int ans = 0;
                    
                    char temp = line.charAt(0);
                    int f = 0;
                    for(int i=1;i<line.length();i++)
                    {
                        if(line.charAt(i)!=temp)
                        {
                            ans++;
                            temp = line.charAt(i);
                            
                        }
                    }
                    if(temp=='-')
                    {
                        ans++;
                    }
                    
                    
                    System.out.println("Case #"+count+": "+ans);
                    count++;
                }
            }
        }
    }


}

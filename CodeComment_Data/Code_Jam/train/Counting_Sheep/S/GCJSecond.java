package methodEmbedding.Counting_Sheep.S.LYD596;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author jay
 */
public class GCJSecond 

{
    public static void main(String args[])throws IOException
    {
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out);
        try (BufferedReader br = new BufferedReader(new FileReader(new File("/Users/jay/NetBeansProjects/Leetcode/src/leetcode/input.txt")))) {
            String line;
            int count = 0;
            int test = 0;
            while ((line = br.readLine()) != null) {
               // process the line.
                //  System.out.println(line);
                
                if(count==0)
                {
                    count++;
                }
                else
                {
                    
                    
                    int n = Integer.parseInt(line);
                    if(n==0)
                    {
                        System.out.println("Case #"+count+": "+"INSOMNIA");
                        count++;
                        continue;
                    }
                    Set <Integer> set = new HashSet<Integer>();
                    
                    for(int i=0;i<=9;i++)
                    {
                        set.add(i);
                    }
                    //System.out.println(set);
                    String s = n+"";
                    for(int i=0;i<s.length();i++)
                    {
                        set.remove(s.charAt(i)-48);
                    }
                    int ans = n;
                    int mul = 2;
                    boolean flag = true;
                    while(flag)
                    {
                        if(set.size()==0)
                        {
                            flag = false;
                            
                            
                        }
                        else{
                            ans = n*mul;
                            mul++;
                            s = ans+"";
                            for(int i=0;i<s.length();i++)
                            {
                                set.remove(s.charAt(i)-48);
                            }
                        }
                    }
                                        
                    System.out.println("Case #"+count+": "+ans);
                    count++;
                }
            }
        }
    }


}

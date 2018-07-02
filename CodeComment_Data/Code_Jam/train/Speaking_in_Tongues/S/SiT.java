package methodEmbedding.Speaking_in_Tongues.S.LYD140;


import java.io.*;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash Agrawal
 */
public class SiT {
    
    public static void main(String [] args) throws FileNotFoundException, IOException
    {
        Scanner scan1 = new Scanner(new File("sample.txt"));
        
        String s1=scan1.next();
        String s2=scan1.next();
        
        int map[] = new int[26];
        
        for(int i=0;i<s1.length();i++)
        {
            map[s1.charAt(i)-'a'] = s2.charAt(i)-'a';
        }
        map[25]='q'-'a';
        map[16] = 25;
        
        Writer output = null;
        File file = new File("output.txt");
        output = new BufferedWriter(new FileWriter(file));
        Scanner scan2 = new Scanner(new File("Input.in"));
        int n = scan2.nextInt();
        int cas = 1;
        String line1=scan2.nextLine();
        while(n--!=0)
        {
            
            line1=scan2.nextLine();
            System.out.print("Case #"+cas+++": ");
            for(int i=0;i<line1.length();i++)
            {
                char c = line1.charAt(i);
                if(c==32)
                {
                    System.out.print(" ");
                    
                }
                else
                {   
                    char c1 = (char) (map[c-'a'] + 'a');
                    System.out.print(c1);
                }
                        
            }
            System.out.println();
            
        }
    }
    
}

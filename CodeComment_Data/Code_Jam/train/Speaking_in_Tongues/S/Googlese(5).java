package methodEmbedding.Speaking_in_Tongues.S.LYD1192;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 *
 * @author t.chikambure
 */
public class Googlese 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            BufferedReader a=new BufferedReader(new FileReader("A.in"));
            BufferedReader b=new BufferedReader(new FileReader("map.txt"));
            BufferedWriter c = new BufferedWriter(new FileWriter("A.out"));
            
            int[]map = new int[26];
            for(int v=0; v<26; v++)
            {
                map[v] = Integer.parseInt(b.readLine());
            }
            
            int i = Integer.parseInt(a.readLine());
            for(int x=0; x<i; x++)
            {
                String line = a.readLine();
                String ans = "";
                //System.out.println(line);
                for(int h = 0; h<line.length(); h++)
                {
                    int og = line.charAt(h);
                    if(og > 96 && og < 123)
                        ans += (char)map[og-97];
                    else
                        ans += " ";
                }
                c.write("Case #"+(x+1)+": "+ans);
                //System.out.println(ans);
                c.newLine();
            }
            a.close();
            b.close();
            c.close();
        }
        catch(IOException e)
        {            
        }
    }
}

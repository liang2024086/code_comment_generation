package methodEmbedding.Counting_Sheep.S.LYD1518;


import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//AC

public class OldMagician
{
    public static void main(String [] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter(new FileOutputStream("output.txt"));
        
        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i<=t; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int w = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if(b % 2 != 0)
                pw.println("Case #"+i+": BLACK");
            else
                pw.println("Case #"+i+": WHITE");
                 
        }
        pw.flush();
     
    }
}

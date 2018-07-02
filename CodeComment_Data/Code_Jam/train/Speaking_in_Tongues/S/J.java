package methodEmbedding.Speaking_in_Tongues.S.LYD559;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


/**
 *
 * @author Joydeep
 */
public class J {
    public static void main(String[] args) throws IOException{
        char original[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char replacement[] = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        DataInputStream ds = new DataInputStream(new FileInputStream("d:/A-small-attempt0.in"));
        Writer os = new BufferedWriter(new FileWriter("d:/output.txt"));
        
        String input;
        String output;
        int N;
        N = Integer.parseInt(ds.readLine());
        for(int i = 1; i<=N;i++)
        {
            output="Case #" + i+": ";
            input = ds.readLine();
            int length = input.length();
            
            for(int j = 0;j<length;j++)
            {
                int pos = -1;
                char c = input.charAt(j);
                
                for(int x = 0;x<26;x++)
                {
                    if(c==original[x])
                    {
                        pos=x;
                        break;
                    }
                }
                if(pos==-1)
                output = output+' ';    
                else
                output = output + replacement[pos];   
            }
            os.write(output);
            String newLine = System.getProperty("line.separator");
            os.write(newLine);
        }
        ds.close();
        os.close();
       
    }
}

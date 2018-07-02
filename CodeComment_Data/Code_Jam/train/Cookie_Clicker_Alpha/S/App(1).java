package methodEmbedding.Cookie_Clicker_Alpha.S.LYD696;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        Reader r = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(r);
        
        String line = br.readLine();
        
        for(int i=0;i<Integer.parseInt(line);++i){
            String cline = br.readLine();
            String[] sa = cline.split(" ");
            StringBuilder sb = new StringBuilder();
            for(int j = sa.length;j>0;--j){
                sb.append(sa[j-1]).append(" ");
            }
            String result =sb.toString();
            
            System.out.println(result.trim());
        }
    }
}

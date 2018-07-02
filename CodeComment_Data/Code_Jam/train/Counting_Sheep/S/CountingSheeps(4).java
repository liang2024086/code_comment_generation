package methodEmbedding.Counting_Sheep.S.LYD673;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class CountingSheeps {

   
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("A-large.in"));
        PrintWriter out = new PrintWriter("A-small.out");

        int t = Integer.parseInt(br.readLine());
        for(int k=1;k<=t;k++)
        {
            int n = Integer.parseInt(br.readLine());
            if(n==0)
            {
                 out.println("Case #"+k+": INSOMNIA");
                continue;
            }
            boolean[] b = new boolean[10];
            
            int count = 0;
            String ns = null;
            for(int i=1;;i++)
            {
                
                ns = String.valueOf(n*i);
                boolean f = false;
                for(int j=0;j<ns.length();j++)
                {
                    
                    if(!b[Character.getNumericValue(ns.charAt(j))])
                    {

                        b[Character.getNumericValue(ns.charAt(j))] = true;
                        f = true;
                        count ++;
                    }
                    
                    
                }

                
                if(count==10)
                {
                    break;
                }
            }
            
                out.println("Case #"+k+": "+ns);
            
            
            
        }
        out.close();
    }
    
}

package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1184;




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class Rd2
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader("D:/Google/Rd2/B-small-attempt0.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:/Google/Rd2/Output_B-small-attempt0.in"));
        
        int testCases;
        testCases=Integer.parseInt(reader.readLine());
        for(int t=0;t<testCases;t++)
        {
            String line=reader.readLine();
            List<String> temp=Arrays.asList(line.split(" "));
            float C,F,X;
            C=Float.parseFloat(temp.get(0));
            F=Float.parseFloat(temp.get(1));
            X=Float.parseFloat(temp.get(2));
            
            float prevCompare=X/2;
            float thisCompare=X/2;
            float ans=0;
            int iter=0;
            
            Boolean flag=true;
            
            while(flag)
            {
                prevCompare=thisCompare;
                ans+=C/(2+(iter*F));
                thisCompare=ans+X/(2+(iter+1)*F);
                if(thisCompare>=prevCompare)
                {
                    flag=false;
                }
                iter++;
            }
            //System.out.println(prevCompare);
            
            writer.write("Case #"+(t+1)+": "+Float.toString(prevCompare)+"\n");
        }
        reader.close();
        writer.close();
    }
    
}

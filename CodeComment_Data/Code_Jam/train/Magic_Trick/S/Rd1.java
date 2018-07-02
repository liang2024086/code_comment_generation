package methodEmbedding.Magic_Trick.S.LYD1596;




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class Rd1
{

  
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader("D:/Google/Rd1/A-small-attempt2.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:/Google/Rd1/Output_A-small-attempt2.in"));
        
        int testCases;
        testCases=Integer.parseInt(reader.readLine());
        for(int t=0;t<testCases;t++)
        {
            String line=null;
            List<String> ansFirstRow=new ArrayList<String>();
            List<String> ansSecondRow=new ArrayList<String>();
            Hashtable <Integer,String> hash1=new Hashtable<Integer,String>();
            Hashtable <Integer,String> hash2=new Hashtable<Integer,String>();
            //Round 1
            int ansFirst=Character.getNumericValue(reader.readLine().charAt(0));
            
            for(int i=0;i<4;i++)
            {
                line=reader.readLine();
                if(i+1==ansFirst)
                    ansFirstRow=Arrays.asList(line.split(" "));
                
            }
            /*int count=0;
            for(String s:ansFirstRow)
            {
                hash1.put(count,s);
            }*/
            //Round 2
            int ansSecond=Character.getNumericValue(reader.readLine().charAt(0));
            
            for(int i=0;i<4;i++)
            {
                line=reader.readLine();
                if(i+1==ansSecond)
                    ansSecondRow=Arrays.asList(line.split(" "));
                
            }
            /*count=0;
            for(String s:ansSecondRow)
            {
                hash2.put(count,s);
            }*/
            
            int matchCounter=0;
            String matchedText="null";
            String ans="null";
            for(String s : ansFirstRow)
            {
                if(ansSecondRow.contains(s))
                {
                    matchCounter++;
                    matchedText=s;
                }
            }
            if(matchCounter==0)
                ans="Case #"+(t+1)+": "+"Volunteer cheated!\n";
            else if(matchCounter==1)
                ans="Case #"+(t+1)+": "+ matchedText+"\n";
            else if(matchCounter>1)
                ans="Case #"+(t+1)+":"+" Bad magician!\n";
            System.out.print(ans);
            writer.write(ans);
        }
        reader.close();
        writer.close();
    }
    
}

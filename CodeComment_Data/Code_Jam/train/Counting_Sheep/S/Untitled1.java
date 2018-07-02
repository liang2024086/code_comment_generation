package methodEmbedding.Counting_Sheep.S.LYD1331;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String args[]) throws IOException
    {

        long temp;
        String tempString,text;
        long length;
        long i=1;
        int j;
        long testcount=0;

        // Create a hash map
        Set<Character> hs = new HashSet<Character>();

        hs.add('1');
        hs.add('2');
        hs.add('3');
        hs.add('4');
        hs.add('5');
        hs.add('6');
        hs.add('7');
        hs.add('8');
        hs.add('9');
        hs.add('0');

        File file = new File("d:\\A-small-attempt1.in"); //input
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String output = "d:\\output.txt"; //output
        PrintWriter pw = new PrintWriter(output);
        text = reader.readLine();
        //testcount = Integer.parseInt(text);
        while ((text = reader.readLine()) != null)
        {
        	i=1;
            Set<Character> count = new HashSet<Character>();
            testcount++;
            while(true)
            {
                temp = (Long.parseLong(text))*i;
                tempString = Long.toString(temp);
                length = tempString.length();
                if(temp==0)
                {
                    pw.print("Case #"+testcount+":"+" INSOMNIA");
                    pw.println();
                    break;
                }
                for(j=0; j<length; j++)
                {
                    if(count.contains(tempString.charAt(j))==false)
                    {
                        count.add(tempString.charAt(j));
                    }

                }
                if(count.equals(hs))
                {
                    pw.print("Case #"+testcount+": "+tempString);
                    pw.println();
                    pw.flush();
                    break;
                }
                i++;
            }
        }
        pw.close();
        reader.close();
    }
}

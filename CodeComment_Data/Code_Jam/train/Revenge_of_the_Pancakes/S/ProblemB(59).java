package methodEmbedding.Revenge_of_the_Pancakes.S.LYD424;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ProblemB {
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        StringBuilder out = new StringBuilder();
        String input;
        
        int t = Integer.parseInt(in.readLine());
        int count = 0;
        
        for(int caseNo = 1; caseNo <= t; caseNo++)
        {
            count = 0;
            input = in.readLine();
            
            for(int i = 1; i < input.length(); i++)
            {
                int j = i - 1;
                
                if(input.charAt(i) != input.charAt(j))
                {
                    count++;
                }
            }
            
            if(input.charAt(input.length() - 1) == '-')
            {
                count++;
            }
        
            out.append("Case #" + caseNo + ": " + count + "\n");
        }
        
        in.close();
        System.out.println(out);
    }
}

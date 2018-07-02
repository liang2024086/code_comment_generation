package methodEmbedding.Speaking_in_Tongues.S.LYD1072;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CodeJam01
{
    public static void main(String[] args)
    {
        try
        {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char map[] = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
        int number_of_inputs;
        number_of_inputs = Integer.parseInt(br.readLine());
        if (number_of_inputs != 0)
        {
            String input;
            String output = "";
            int i,j;
            for(i = 0; i < number_of_inputs; i++)
            {
                output = "Case #" + (i+1) + ": ";
                input = br.readLine();
                for(j=0; j<input.length(); j++)
                {
                    if(input.charAt(j) >= 'a' && input.charAt(j) <='z')
                    {
                        output += Character.toString(map[input.charAt(j)-'a']);
                    }
                    else if(input.charAt(j) >= 'A' && input.charAt(j) <='Z')
                    {
                        output += Character.toString(map[input.charAt(j)-'A']).toUpperCase();
                    }
                    else
                    {
                        output += Character.toString(input.charAt(j));
                    }
                }
                System.out.println(output);
            }
        }
        }
        catch (IOException ex)
        {
            Logger.getLogger(CodeJam01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

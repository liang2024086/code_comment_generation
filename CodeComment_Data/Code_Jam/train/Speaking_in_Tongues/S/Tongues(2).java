package methodEmbedding.Speaking_in_Tongues.S.LYD956;

import java.io.*;
import java.util.*;

public class Tongues
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new File("tongues_small.in"));
        //Scanner in = new Scanner(System.in);
        
        HashMap<String, String> trans = new HashMap<>();
        trans.put("a", "y");
        trans.put("b", "h");
        trans.put("c", "e");
        trans.put("d", "s");
        trans.put("e", "o");
        trans.put("f", "c");
        trans.put("g", "v");
        trans.put("h", "x");
        trans.put("i", "d");
        trans.put("j", "u");
        trans.put("k", "i");
        trans.put("l", "g");
        trans.put("m", "l");
        trans.put("n", "b");
        trans.put("o", "k");
        trans.put("p", "r");
        trans.put("q", "z");
        trans.put("r", "t");
        trans.put("s", "n");
        trans.put("t", "w");
        trans.put("u", "j");
        trans.put("v", "p");
        trans.put("w", "f");
        trans.put("x", "m");
        trans.put("y", "a");
        trans.put("z", "q");
        trans.put(" ", " ");

        int runs = Integer.parseInt(in.nextLine().trim());
        int count = 0;
        while(++count <= runs)
        {
            out.print("Case #" + count + ": ");
            String line = in.nextLine();
            for(int i = 0; i < line.length(); i++)
                out.print(trans.get(line.substring(i, i+1)));
            out.println();
        }
        
        out.close();
    }
}

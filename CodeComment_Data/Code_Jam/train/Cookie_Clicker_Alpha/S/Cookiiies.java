package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1618;


import java.io.File;
import java.io.IOException;
import java.util.List;

import net.lab0.tools.FileUtils;

/**
 * @author 116@lab0.net
 * 
 */
public class Cookiiies
{
    public static void main(String[] args)
    throws IOException
    {
        String in = null;
        if (args.length > 0)
        {
            in = args[0];
        }
        else
        {
            in = ".\\rc\\B-small-attempt0.in";
        }
        
        List<String> data = FileUtils.readFileAsText(new File(in));
        int count = Integer.parseInt(data.get(0));
        for (int i = 1; i <= count; ++i)
        {
            Case c = new Case(data.get(i));
            System.out.println("Case #" + i + ": " + c.solveByIterating());
        }
    }
}

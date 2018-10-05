package methodEmbedding.Speaking_in_Tongues.S.LYD778;


import codejam2012.util.ReadWriteUtil;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

/**
 *
 * @author fedez
 */
public class Main
{

    /**
     * Args0 in file
     * Args1 out file
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        List<String> in;
        List<String> xlated;
        String xlatedString;
        Formatter formatter = new Formatter();

        int caseNumber = 1;

        in = ReadWriteUtil.readFile(args[0]);
        if (in.size() < 2 || Integer.parseInt(in.get(0)) != in.size() - 1)
        {
            throw new Exception("Input error");
        }
        in.remove(0);

        xlated = new ArrayList<String>(in.size());
        for (String line : in)
        {
            xlatedString = Translator.translate(line);
            xlated.add("Case #" + caseNumber + ": " + xlatedString);
            caseNumber ++;
        }
        ReadWriteUtil.writeFile(args[1], xlated);
    }
}

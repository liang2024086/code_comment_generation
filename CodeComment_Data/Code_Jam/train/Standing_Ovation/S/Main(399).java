package methodEmbedding.Standing_Ovation.S.LYD2188;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class Main
{
    private static int limit = 0;
    private static String[] numberAfterSplit;
    public static final String DEV_ECLIPSE_ROOT_DIR = "testdata/";
    public static final String COMMON_PROPERTIES_FILE = DEV_ECLIPSE_ROOT_DIR + "A-small-attempt0.in";

    public static void main(final String[] args)
            throws Exception
    {
        int testCount = 0;
        final BufferedReader br = new BufferedReader(new FileReader(COMMON_PROPERTIES_FILE));
        String line = br.readLine();
        testCount = Integer.parseInt(line);
        int testCase = 1;
        final File fout = new File("out.txt");
        final FileOutputStream fos = new FileOutputStream(fout);
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        while (line != null)
        {
            line = br.readLine();
            final String[] retval = line.split(" ");
            limit = Integer.parseInt(retval[0]);
            final String s = retval[1].trim();
            numberAfterSplit = s.split("");
            int sum = 0;

            final int[] intArray = new int[numberAfterSplit.length - 1];
            for (int i = 1; i < numberAfterSplit.length; i++)
            {
                final int parse = Integer.parseInt(numberAfterSplit[i]);
                sum += parse;
                intArray[i - 1] = parse;
            }

            //System.out.println(sum);
            int addAud = 0;
            for (int i = 0; i < intArray.length; i++)
            {
                sum -= intArray[intArray.length - 1 - i];
                if (sum < limit)
                {
                    addAud += limit - sum;
                    sum += addAud;

                }
                limit -= 1;

            }

            bw.write("Case #" + testCase + ": " + addAud);
            bw.newLine();
            testCase++;
            if (testCase > testCount)
            {
                bw.close();
                break;
            }
        }

    }

}

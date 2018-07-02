package methodEmbedding.Standing_Ovation.S.LYD1023;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class Main
{
    private static int limit = 0;
    private static int numberAfterSplit = 0;
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
            numberAfterSplit = Integer.parseInt(retval[1]);
            int sum = 0;
            int input = numberAfterSplit;
            int lastDigit = numberAfterSplit % 10;

            while (input != 0)
            {

                sum += lastDigit;
                input /= 10;
                lastDigit = input % 10;
            }

            input = numberAfterSplit;
            lastDigit = numberAfterSplit % 10;

            int addAud = 0;
            while (input != 0)
            {
                sum -= lastDigit;
                if (sum < limit)
                {
                    addAud += limit - sum;
                    sum += addAud;

                }

                input /= 10;
                lastDigit = input % 10;
                limit -= 1;
            }

            System.out.println("Case #" + testCase + ": " + addAud);
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

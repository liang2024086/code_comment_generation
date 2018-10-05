package methodEmbedding.Standing_Ovation.S.LYD541;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class StandingOvation
{
    public static void main(String[] args) throws IOException
    {
        LineIterator input = FileUtils.lineIterator(new File("C:\\Users\\Raisins\\Downloads\\A-small-attempt2.in"), "UTF-8");
        File output = new File("C:\\Users\\Raisins\\Downloads\\A-small-attempt2.out");

        final int cases = Integer.parseInt(input.nextLine());

        ArrayList<String> entireOutput = new ArrayList<String>();

        for (int i = 0; i < cases; i++)
        {
            System.out.print("Case #" + (i + 1) + ": ");
            String out = ("Case #" + (i + 1) + ": ");
            FileUtils.writeStringToFile(output, out);

            final char[] source = input.next().toCharArray();

            final int maxShyness = 1 + Integer.parseInt(source[0] + "");

            int standing = 0;
            int added = 0;

            for (int j = 0; j < maxShyness; j++)
            {
                if (standing < j)
                {

                    added++; standing++;
                }
                standing += Integer.parseInt(source[j + 2] + "");
            }

            System.out.println(added);
            entireOutput.add(out + added);
        }
        FileUtils.writeLines(output, entireOutput);
        LineIterator.closeQuietly(input);
    }
}

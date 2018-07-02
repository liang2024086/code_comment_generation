package methodEmbedding.Standing_Ovation.S.LYD500;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;

/**
 * Created by The Networks on 4/11/2015.
 */
public class mainClass {

    public static void main(String[] args)
    {
        BufferedReader cin =  new BufferedReader(new InputStreamReader(System.in));

        String file = null;
        try {
            System.out.print("Filename: ");
            file = cin.readLine();

            BufferedReader reader = new BufferedReader(new InputStreamReader(mainClass.class.getResourceAsStream(file)));
            String line = reader.readLine();
            int testCases = Integer.parseInt(line);

            for( int i = 0; i < testCases; i++)
            {
                line = reader.readLine();
                Solution obj_Solution = new Solution();
                System.out.println("Case #"+(i+1)+": "+obj_Solution.solve(line));
            }

        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

}

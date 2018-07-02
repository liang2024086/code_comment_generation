package methodEmbedding.Magic_Trick.S.LYD1905;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Date: 4/12/14
 * Time: 11:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        String path = args[0];

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            MagicTrick magicTrick = new MagicTrick();

            // Get number of inputs
            int numInputs = Integer.parseInt(line);

            for (int i = 0; i < numInputs; i++) {
                // read the next 10 lines
                ArrayList<String> lines = new ArrayList<String>();

                for (int j = 0; j < 10; j++) {
                    lines.add(br.readLine());
                }

                System.out.println(String.format("Case #%d: %s", i + 1, magicTrick.solve(lines)));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

package methodEmbedding.Revenge_of_the_Pancakes.S.LYD314;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by trsmith on 4/9/2016.
 */
public class FlipCounter {
    //0 means even
    //1 minus 1
    //+-+-+-
    //-+-+-+
    //-+-+-+-
    //+-+-+-+

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:/Users/trsmith/Desktop/B-small-attempt0.in");
        List<String> input = Files.readAllLines(path);


        File file = new File("output.txt");
        PrintWriter p = new PrintWriter(file);

        for (int i = 1; i < input.size(); i += 1)
        {
            ArrayList<Boolean> stack = new ArrayList<Boolean>();
            char[] chars = input.get(i).toCharArray();
            boolean current;

            if (chars[0] == '+') {
                current = true;
            } else {
                current = false;
            }

            for (int j = 0; j < chars.length; j += 1) {
                if (current) {
                    if (chars[j] == '-') {
                        stack.add(true);
                        current = false;
                    }
                } else {
                    if (chars[j] == '+') {
                        stack.add(false);
                        current = true;
                    }
                }
            }

            int flips;
            if (chars[chars.length - 1] == '+') {
                stack.add(true);
                flips = stack.size() - 1;
            } else {
                stack.add(false);
                flips = stack.size();
            }

            p.println("Case #" + i + ": " + flips);
        }
        p.close();
    }


}


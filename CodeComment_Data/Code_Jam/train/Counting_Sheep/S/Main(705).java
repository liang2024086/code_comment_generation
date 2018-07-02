package methodEmbedding.Counting_Sheep.S.LYD309;


import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        List<String> input = Files.readAllLines(Paths.get(ClassLoader.getSystemResource("A-small-attempt0.in").toURI()));

        OutputStream os = new FileOutputStream("output.txt");
        PrintWriter pw = new PrintWriter(os);

        for (int i = 1; i < input.size(); i++) {
            int cur = Integer.parseInt(input.get(i));

            if (cur == 0){
                pw.println("Case #" + i + ": INSOMNIA");
            } else {
                Set<Integer> values = new HashSet<Integer>();
                for (int j = 0; j < 10; j++) {
                    values.add(j);
                }

                int res = 0;

                while (values.size() > 0){
                    res += cur;

                    int curValue = res;
                    while (curValue > 0){
                        values.remove(curValue % 10);
                        curValue /= 10;
                    }
                }


                pw.println("Case #" + i + ": " + res);
            }

//            pw.println();
        }

        pw.close();
    }
}

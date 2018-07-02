package methodEmbedding.Counting_Sheep.S.LYD1012;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class Main {

    public static void main(String[] args) {

        String fileName = "C://Users//simon//Downloads/A-small-attempt0.in";
        Set<Integer> bits = new HashSet<>();
        bits.add(0);
        bits.add(1);
        bits.add(2);
        bits.add(3);
        bits.add(4);
        bits.add(5);
        bits.add(6);
        bits.add(7);
        bits.add(8);
        bits.add(9);

        Writer writer = new PrintWriter(System.out);

        try {
            List<String> lignes = Files.lines(Paths.get(fileName)).collect(Collectors.toList());

            for (int i = 1; i < lignes.size() ; i++) {
                int number = Integer.parseInt(lignes.get(i));
                Set<Integer> find = new HashSet<>();

                for (int j = 1 ; j <= 1000 ; j++){
                    int x = number * j;
                    int tmp = x;
                    while (tmp > 0) {
                        find.add(tmp % 10);
                        tmp = tmp / 10;
                    }


                    if (find.containsAll(bits)){
                        writer.append("Case #" + i + ": " +  x + "\n");
                        break;
                    }
                }

                if (!find.containsAll(bits)){
                    writer.append("Case #" + i +  ": INSOMNIA\n");
                }
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

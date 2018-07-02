package methodEmbedding.Counting_Sheep.S.LYD1699;


import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Problem1 {

    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("src/dinbur/codejam/qualification/input.txt"))) {
            String line = br.readLine();
            int totalExamples = Integer.parseInt(line);
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < totalExamples; i++) {
                line = br.readLine();
                int startingNumber = Integer.parseInt(line);
                if (startingNumber == 0) {
                    res.append(String.format("Case #%d:\tINSOMNIA\n", i+1));
                } else {
                    int currentValue = startingNumber;
                    Set<Character> chars = new HashSet<>();
                    while (chars.size() != 10) {
                        for (char c : String.valueOf(currentValue).toCharArray()) {
                            chars.add(c);
                        }
                        currentValue += startingNumber;
                    }
                    res.append(String.format("Case #%d:\t%d\n", i+1, currentValue - startingNumber));
                }
            }
            PrintWriter writer = new PrintWriter("output.txt");
            writer.print(res.toString());
            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

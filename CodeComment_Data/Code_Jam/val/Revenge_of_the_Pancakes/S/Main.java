package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1013;


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("input.in");
        Scanner file = new Scanner(fr);
        PrintWriter writer = new PrintWriter("output.out", "UTF-8");

        int testsNumber = file.nextInt();
        for (int i = 0; i < testsNumber; i++) {
            String pancakes = file.next();
            String token = "-";
            int counter = 0;
            while (pancakes.contains(token)) {
                pancakes = pancakes.substring(0, pancakes.lastIndexOf(token));
                counter++;
                switch (token) {
                    case "-":
                        token = "+";
                        break;
                    case "+":
                        token = "-";
                        break;
                }
            }

            writer.println("Case #" + (i+1) + ": " + counter);
        }
        writer.close();
        fr.close();
        file.close();
    }
}

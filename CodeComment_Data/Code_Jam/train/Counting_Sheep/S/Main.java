package methodEmbedding.Counting_Sheep.S.LYD1453;


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
            int number = file.nextInt(), tmp = number;
            boolean [] digits = new boolean[10];
            int counter = 0, j;

            if (number == 0) {
                writer.println("Case #" + (i+1) + ": INSOMNIA");
                continue;
            }

            for (j = 0; counter < 10; j++) {
                while (tmp != 0) {
                    int index = tmp % 10;
                    if (!digits[index]) {
                        digits[index] = true;
                        counter++;
                    }
                    tmp /= 10;
                }
                tmp = number*(j+1);
            }
            j--;
            writer.println("Case #" + (i+1) + ": " + number*j);
        }
        writer.close();
        fr.close();
        file.close();
    }
}

package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("b"));
        int c = Integer.parseInt(reader.readLine());

        FileWriter writer = new FileWriter("outb");

        for (int i = 1; i <= c; i++) {
            int count = 0;
            String line = reader.readLine();
            while (line.contains("-")) {
                int lastIndexOf = line.lastIndexOf('-');

                if (lastIndexOf == line.length() - 1) {
                    char[] chars = line.toCharArray();
                    for (int j=0;j<chars.length;j++) {
                        if (chars[j] == '-')
                            chars[j] = '+';
                        else chars[j] = '-';
                    }
                    line = Arrays.toString(chars).replaceAll("[^+-]","");
                    count++;
                } else {
                    char[] chars = line.substring(0, lastIndexOf + 1).toCharArray();
                    for (int j=0;j<chars.length;j++) {
                        if (chars[j] == '-')
                            chars[j] = '+';
                        else chars[j] = '-';
                    }
                    line = Arrays.toString(chars).replaceAll("[^+-]","").concat(line.substring(lastIndexOf + 1));
                    count++;
                }

            }
            writer.write("Case #" + i + ": " + count+"\n");
            System.out.println("Case #" + i + ": " + count);

        }
        writer.close();
    }
}

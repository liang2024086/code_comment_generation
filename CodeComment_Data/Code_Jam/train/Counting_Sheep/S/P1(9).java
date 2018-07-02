package methodEmbedding.Counting_Sheep.S.LYD932;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("p1.data"));
        HashMap<String, String> data = new HashMap<String, String>();
        while (s.hasNext()) {
            String line = s.nextLine();
            String[] splitLine = line.split(",");
            data.put(splitLine[0], splitLine[1]);
        }

        s.close();

        s = new Scanner(new File("p1.in"));
        FileWriter f = new FileWriter(new File("p1.out"));
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            f.write("Case #" + (i + 1) + ": " + data.get(String.valueOf(n))+"\n");
        }
        s.close();
        f.close();
    }
}

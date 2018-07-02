package methodEmbedding.Counting_Sheep.S.LYD238;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static File inputsource = new File("input.txt");

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(inputsource);
        File statText = new File("output.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(statText);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        Writer writer = new BufferedWriter(outputStreamWriter);

        int t = 1, i, j,k,l;
        boolean found = false;
        HashSet<Integer> hashSet = new HashSet<>();
        l = scanner.nextInt();
        while(t <=  l) {
            i = scanner.nextInt();
            hashSet.clear();
            j = 1;
            found = false;
            if(i == 0) {
                System.out.println("Case #" + t + ": " + "INSOMNIA");
                writer.write("Case #" + t + ": INSOMNIA\n");
            } else {

                while(true) {
                    k = i * j;
                    while (k > 0) {
                        hashSet.add(k % 10);
                        if(hashSet.size() == 10) {
                            System.out.println(i*j);
                            writer.write("Case #" + t + ": " + (i*j) + "\n");
                            found = true;
                            break;
                        }
                        k /= 10;
                    }
                    if(found)
                        break;
                    j++;
                }
            }
            t++;
        }
        writer.close();
    }
}

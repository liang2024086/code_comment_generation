package methodEmbedding.Counting_Sheep.S.LYD775;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static File inputsource = new File("input.txt");

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(inputsource);
        File statText = new File("output.txt");
        FileOutputStream is = new FileOutputStream(statText);
        OutputStreamWriter osw = new OutputStreamWriter(is);
        Writer writer = new BufferedWriter(osw);

        int t = 1, n, k,m,p;
        boolean found = false;
        HashSet<Integer> bag = new HashSet<>();
        p = sc.nextInt();
        while(t <=  p) {
            n = sc.nextInt();
            bag.clear();
            k = 1;
            found = false;
            if(n == 0) {
                System.out.println("Case #" + t + ": " + "INSOMNIA");
                writer.write("Case #" + t + ": INSOMNIA\n");
            } else {

                while(true) {
                    m = n * k;
                    while (m > 0) {
                        bag.add(m % 10);
                        if(bag.size() == 10) {
                            System.out.println(n*k);
                            writer.write("Case #" + t + ": " + (n*k) + "\n");
                            found = true;
                            break;
                        }
                        m /= 10;
                    }
                    if(found)
                        break;
                    k++;
                }
            }
            t++;
        }
        writer.close();
    }
}

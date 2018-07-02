package methodEmbedding.Counting_Sheep.S.LYD21;

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Sheep {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            FileInputStream fis = new FileInputStream("sheep.in");
            br = new BufferedReader(new InputStreamReader(fis));
        } catch (IOException ioe) {
            System.out.println("File not found");
            System.exit(0);
        }

        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException ioe) {
            System.out.println("Could not read preamble");
            System.exit(0);
        }

        try {
            FileWriter fw = new FileWriter("sheep.out");
            for (int c = 1; c <= n; c++) {
                int number = Integer.parseInt(br.readLine()),
                    orig = number;
                System.out.println(number);

                if (number == 0) {
                    fw.write("Case #" + c + ": INSOMNIA\n");
                    continue;
                }
                int digitFlag = 0;

                while (true) {
                    int num = number;
                    while (num != 0) {
                        //System.out.println("N" + num);
                        //System.out.println("D" + digitFlag);
                        digitFlag |= 1 << (num % 10);
                        num /= 10;
                    }
                    if (digitFlag == 1023) {
                        fw.write("Case #" + c + ": " + number + "\n");
                        break;
                    }
                    number += orig;
                }
            }
            fw.close();
            br.close();
        } catch (IOException ioe) {
            System.out.println("Problem when reading file");
            System.exit(0);
        }
    }
}

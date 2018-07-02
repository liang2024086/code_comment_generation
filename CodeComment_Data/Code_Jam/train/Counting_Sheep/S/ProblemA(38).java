package methodEmbedding.Counting_Sheep.S.LYD1121;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProblemA {
    private static final String FILENAME = "A-small-attempt0";

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new FileReader(FILENAME + ".in"));
        PrintWriter output = new PrintWriter(new FileWriter(FILENAME + ".out"));

        long start = System.currentTimeMillis();
        int testCase = input.nextInt();
        for (int t=1; t<=testCase; t++) {
        	int N = input.nextInt();
        	int cnt = 1;
        	int num = 0;
        	int check = 0;
        	while (N != 0 && check != 0x3FF) {
        		num = N * cnt;
        		do {
        			check = check | (1 << (num % 10));
        			num = num / 10;
        		} while (num > 0);
        		cnt++;
        	}

        	output.print("Case #" + t + ": ");
        	if (N == 0) {
        		output.print("INSOMNIA");
        	} else {
        		output.print(N * (cnt - 1));
        	}
        	output.print("\n");
        }
        System.out.printf("Total duration: %dms\n", System.currentTimeMillis() - start);

        input.close();
        output.close();
	}
}

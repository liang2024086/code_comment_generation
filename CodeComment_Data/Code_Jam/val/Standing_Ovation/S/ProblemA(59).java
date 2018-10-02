package methodEmbedding.Standing_Ovation.S.LYD2054;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ProblemA {

	public static void main(String[] args) throws IOException {
		File file = new File("A-small-attempt0.in");
		FileWriter fstream = new FileWriter("A-small-out.txt");
		BufferedWriter out = new BufferedWriter(fstream);
		@SuppressWarnings("resource")
		Scanner in = new Scanner(file);
		int T = in.nextInt();
		
		for (int t=1; t<=T; t++) {
			int s_max = in.nextInt();
            int s_temp = in.nextInt();

            int[] s = new int[s_max+1];

            for (int i = s_max; i >= 0; --i) {
                s[i] = s_temp % 10;
                s_temp /= 10;
            }

            int y = 0; //number of friends invited
            int num_standing = 0;
            for (int i = 0; i <= s_max; ++i) {
                if (num_standing >= i) {
                    num_standing += s[i];
                } else {
                    int num_invited = i - num_standing;
                    y += num_invited;
                    num_standing += num_invited + s[i];
                }
            }

			out.write("Case #"+ t +": " + y);
			out.newLine();
		}
		
		out.close();
	}
}

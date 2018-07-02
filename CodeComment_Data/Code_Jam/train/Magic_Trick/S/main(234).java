package methodEmbedding.Magic_Trick.S.LYD1991;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;


public class main {

	public static void main(String[] args) throws IOException {
		InputStream    fis;
		BufferedReader br;
		String         line;
		PrintWriter writer = new PrintWriter("output", "UTF-8");
		//writer.println("The first line");

		fis = new FileInputStream("input");
		br = new BufferedReader(new InputStreamReader(fis, Charset.forName("UTF-8")));
		int nb_of_cases = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < nb_of_cases;i++) {
			testcase t = new testcase();
			t.set_first_row(Integer.parseInt(br.readLine()));
		
			int[][] temp = new int[4][4];
			for(int j = 0; j < 4;j++) {
				String[] s = br.readLine().split("\\s+");
				for(int h = 0; h < 4;h++) {
					temp[j][h] = Integer.parseInt(s[h]);
				}
			}
			t.set_first_field(temp);
			t.set_second_row(Integer.parseInt(br.readLine()));
			
			int[][] temp2 = new int[4][4];
			for(int j = 0; j < 4;j++) {
				String[] s = br.readLine().split("\\s+");
				for(int h = 0; h < 4;h++) {
					temp2[j][h] = Integer.parseInt(s[h]);
				}
			}
			t.set_secpond_field(temp2);
			writer.println("Case #"+(i+1)+": "+t.result());
		}
		
		System.out.println(nb_of_cases);
		
		// Done with the file
		br.close();
		br = null;
		fis = null;
		writer.close();
	}

}

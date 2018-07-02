package methodEmbedding.Cookie_Clicker_Alpha.S.LYD691;

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
			
			String[] s = br.readLine().split("\\s+");
			
			t.set_c(Double.parseDouble(s[0]));
			t.set_f(Double.parseDouble(s[1]));
			t.set_x(Double.parseDouble(s[2]));
			
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

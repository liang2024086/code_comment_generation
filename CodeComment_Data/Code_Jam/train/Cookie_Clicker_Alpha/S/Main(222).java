package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1372;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static File input = new File("D:\\B-small-attempt0.in");
	static File output = new File("D:\\output.txt");

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(input);
		BufferedWriter bw = new BufferedWriter(new FileWriter(output.getAbsoluteFile()));
		
		int N = in.nextInt();

		in.nextLine();
		for (int i = 0; i < N; i++) {
			String line = in.nextLine();
			StringTokenizer st = new StringTokenizer(line);
			
			double C = Double.parseDouble(st.nextElement().toString());
			double F = Double.parseDouble(st.nextElement().toString());
			double X = Double.parseDouble(st.nextElement().toString());
			
			double ptime = X / 2.0;
			double ctime = C / 2.0 + X / (2.0 + F);
			double V = 2.0 + F;
			
			while (ctime < ptime) {
				ptime = ctime;
				ctime = ctime - X / V;
				
				double t1 = C / V;
				V = V + F;
				double t2 = X / V;
				ctime = ctime + t1 + t2;
			}
			
			DecimalFormat df = new DecimalFormat("#.0000000"); 
			
			bw.write("Case #" + (i + 1) + ": " + df.format(ptime) + "\n");
		}
		System.out.println("Done!");
		bw.close();
		in.close();
	}
}

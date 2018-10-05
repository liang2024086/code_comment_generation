package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1015;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem1B {
	
	public static void main(String[] args) throws IOException {
		new Problem1B(args[0]);
	}
	
	public Problem1B(String fname) throws IOException {
		File ff = new File(fname);
		Scanner in = new Scanner(new BufferedReader(new FileReader(ff)));
		BufferedWriter out = new BufferedWriter(new FileWriter(ff.getParentFile().getPath()+"/OUT_"+ff.getName()));
		int t = in.nextInt();
		
		for (int i = 1; i <= t; i++) {
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
			//double[] STF = new double[400];
			//double[] CPS = new double[400];
			double ttw[] = new double[1000000];
			double cps = 2.0;
			double time = 0;
			ttw[0] = x/cps;
			int n = 0;
			int farms = 0;
			do {
				farms++;
				time += c/cps;
				cps += f;
				ttw[farms] = time+x/cps;
				if (ttw[farms] <= ttw[n]) {
					n = farms;
				}
			} while (ttw[farms] <= ttw[n]);
			out.write(String.format("Case #%d: %.7f",i,ttw[n]));
			out.newLine();
			
			
			
		}
		in.close();
		out.close();
	}

}

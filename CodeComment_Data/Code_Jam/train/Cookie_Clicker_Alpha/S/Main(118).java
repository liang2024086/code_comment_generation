package methodEmbedding.Cookie_Clicker_Alpha.S.LYD576;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	private File in = new File("B-small-attempt0.in");
	private File out = new File("out.txt");
	private Scanner sc;
	private PrintWriter pw;
	
	public Main() {
		try {
			sc = new Scanner(in);
			pw = new PrintWriter(out);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int nCase;
		double C, F, X;
		double cps, time, farm, end, farmEnd;

		nCase = sc.nextInt();

		for (int n = 1; n <= nCase; n++) {
			C = sc.nextDouble();
			F = sc.nextDouble();
			X = sc.nextDouble();
			cps = 2;
			time = 0;

			do {
				farm = C / cps;
				end = X / cps;
				farmEnd = farm + X / (cps + F);

				if (end <= farmEnd) {
					time += end;
					break;
				}
				else {
					cps += F;
					time += farm;
				}
			} while(true);

			pw.printf("Case #%d: %.6f\n", n, time);
		}
		pw.flush();
		pw.close();
	}

	public static void main(String[] args) {
		new Main();
	}

}

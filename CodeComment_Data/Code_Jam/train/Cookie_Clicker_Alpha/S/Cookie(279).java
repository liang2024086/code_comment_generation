package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1048;

import java.io.File;
import java.util.Scanner;
public class Cookie {
	public static void main(String[] args) throws Exception {
		if(args.length < 1) {
			System.out.println("Usage : java Cookie <inputfile>");
			return;
		}
		File f = new File(args[0]);
		Scanner sc = new Scanner(f);
		int count = sc.nextInt();
		for(int n=1;n<=count;n++) {
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			double cookiep = 2.0;
			double ret = X / cookiep;
			double sum = 0.0;
			while(true) {
				sum += (C / cookiep);
				cookiep += F;
				double r = sum+(X/cookiep);
				if(r < ret) ret = r;
				else break;
			}
			System.out.println("Case #"+n+": "+ret);
		}
	}
}

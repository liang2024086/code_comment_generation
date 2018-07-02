package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1455;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static int t,o,n;
	public static double c,f,x,ans,sum;
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("1.txt");
		Scanner scanner = new Scanner(file);
		t = scanner.nextInt();
		o = 0;
		while (++o <= t) {
			c = scanner.nextDouble();
			f = scanner.nextDouble();
			x = scanner.nextDouble();
			ans = x/2;
			n = 0;
			sum = 0;
			while (true) {
				sum += c/(2+n*f);
				n++;
				double tmp = sum + x/(2+n*f);
				if (tmp > ans) break;
				ans = tmp;
			}
			System.out.print("Case #"+o+": ");
			System.out.println(String.format("%.7f", ans));
		}
	}

}

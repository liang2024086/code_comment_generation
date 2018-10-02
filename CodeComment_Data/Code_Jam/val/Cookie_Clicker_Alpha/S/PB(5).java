package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1403;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PB{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int z = input.nextInt();
		for (int i=1; i<=z; i++){
			double c = input.nextDouble();
			double f = input.nextDouble();
			double x = input.nextDouble();
			double r = x;
			double t = 0;
			double y = 2;
			double p = c/f;
			boolean b = p*(y+f)<=r;
			while (b){
				t += c/y;
				y += f;
				if (c*(y+f)/f>r) b = false;
			}
			t += r/y;
			DecimalFormat df = new DecimalFormat("#.0000000");
			System.out.println("Case #"+i+": "+df.format(t));
		}
	}
}

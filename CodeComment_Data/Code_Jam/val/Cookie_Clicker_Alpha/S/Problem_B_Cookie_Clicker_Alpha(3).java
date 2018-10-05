package methodEmbedding.Cookie_Clicker_Alpha.S.LYD129;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Problem_B_Cookie_Clicker_Alpha {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		PrintWriter out = new PrintWriter("Bout.in", "UTF-8");
		Scanner in = new Scanner(new File("Bin.txt"));
		int T = in.nextInt();
		int j = 1;
		while (T > 0) {
			T--;

			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			double aTotal = 0;
			double bTotal = 0;
			double result = 0;
			double copy = F;
			double Total = 0;
			aTotal = C / 2;
			F = F + 2;
			result = aTotal + X / F;
			bTotal = X / 2;
			Total = C / 2;  /*??? ???? ????? ????? */

			if (bTotal > /*??? ???? ????? = ????? ?? ?????? ?? ??? ????????*/ result) {
				while (bTotal > result) {
					
					aTotal = C / F;
					bTotal = X / F;
					F = F + copy;
					result = aTotal + X / F;
					if (bTotal > result)
						Total += aTotal;
					else
						Total += bTotal;

				}
				if(T != 0)
				out.println("Case #" + j + ": "+Math.ceil(Total * 10000000) / 10000000);
				else
				out.print("Case #" + j + ": "+Math.ceil(Total * 10000000) / 10000000);

				
			} else {
				Total = X / 2;
				if(T != 0)
					out.println("Case #" + j + ": "+Math.ceil(Total * 10000000) / 10000000);
					else
					out.print("Case #" + j + ": "+Math.ceil(Total * 10000000) / 10000000);

			}

			j++;

		}
		out.close();
		in.close();
	}

}

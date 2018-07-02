package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1149;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Zhenyi
 * 2014 Apr 11, 2014 7:51:01 PM
 */
public class CookieClickerAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File(
				"C:/Users/Zhenyi/Downloads/B-small-attempt0.in"));
		FileWriter out = new FileWriter(
				"C:/Users/Zhenyi/Downloads/B-small-attempt0.out");

		int N = in.nextInt();

		for (int cases = 1; cases <= N; cases++) {
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			double result = X/2;
			int round = 1;
			while(true){
				double tmp = 0;
				tmp += X / (F * round + 2);
				for(int i = 0; i < round; i++){
					tmp += C / (2 + F * i);
				}
				if(tmp < result){
					result = tmp;
					round++;
				}else{
					break;
				}
			}
			out.write("Case #" + cases + ": " + result +"\n");
		}
		in.close();
		out.flush();
		out.close();
	}

}

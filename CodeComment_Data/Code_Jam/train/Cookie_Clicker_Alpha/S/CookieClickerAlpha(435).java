package methodEmbedding.Cookie_Clicker_Alpha.S.LYD202;


import java.util.Locale;
import java.util.Scanner;

public class CookieClickerAlpha {
	/**
	 * 
	 * @author Neill Giraldo
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//Generated Main Method
		Scanner lectura = new Scanner(System.in);
		int cases = Integer.parseInt(lectura.nextLine());
		String[] values;
		double[] val = new double[3];
		double w1, w2,acco,ant;
		for(int i=1;i<=cases;i++){
			values = lectura.nextLine().split(" ");
			val[0] = Double.parseDouble(values[0]);
			val[1] = Double.parseDouble(values[1]);
			val[2] = Double.parseDouble(values[2]);
			acco = 2;
			w1 = val[2]/acco;
			w2 = val[0]/acco;
			ant = (val[2]/acco)+1;
			while(ant>w1)
			{
				ant = w1;
				acco+=val[1];
				w1 = w2 + val[2]/acco;
				w2 = w2 + val[0]/acco;
			}
			
			System.out.printf("Case #"+i+": "+String.format(Locale.US,"%.7f",ant)+"\n");
		}
	}

}

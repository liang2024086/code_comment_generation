package methodEmbedding.Cookie_Clicker_Alpha.S.LYD855;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Cookie {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			double c, f, x;
			c = scan.nextDouble();
			f = scan.nextDouble();
			x = scan.nextDouble();

			double pace = 2.0;
			double time = 0.0;

			while(x/pace > c/pace + x/(pace+f)){
				time += c/pace;
				pace += f;		
			}
			time += x/pace;
			
			DecimalFormat df = new DecimalFormat("#.#######");
			
			
			System.out.println("Case #" + (i+1) + ": "+ df.format(time));
		}
	}
}

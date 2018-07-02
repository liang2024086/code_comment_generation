package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1018;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("B-small-attempt0.in");
		PrintWriter out = new PrintWriter("B-out.txt");
		Scanner input = new Scanner(f);
		int numofcase = input.nextInt();
		double C = 0.0;
		double F = 0.0;
		double X = 0.0;
		double rate = 2.0;
		double time = 0.0;
		double time1 = 0.0;
		double time2 = 0.0;
		
		for(int i = 0; i < numofcase; i++){
				C = input.nextDouble();
				F = input.nextDouble();
				X = input.nextDouble();
				while(true){
					time1 = X /rate;
					time2 = C / rate + X / (rate + F);
					if(time1 < time2){
						time = time + time1;
						System.out.format("Case #" + (i+1) + ": " + "%.7f\n", time);
						out.format("Case #" + (i+1) + ": " + "%.7f\n", time);
						break;
					}
					else{
						time = time + C/rate;
						rate = rate + F;
						//System.out.println(time);
					}
					
				}
				time = 0.0;
				rate = 2.0;
				
			
		}
		
		input.close();
		//out.close();
	}

}

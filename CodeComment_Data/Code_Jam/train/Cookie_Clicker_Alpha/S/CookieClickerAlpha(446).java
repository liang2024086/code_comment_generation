package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1175;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClickerAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String filename = "B-small-attempt1.in";
			String out = "B.out";
			Scanner sc = new Scanner(new File(filename));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(out)));
			//Scanner sc = new Scanner(System.in);
			int numcase = sc.nextInt();
			for(int zz = 0; zz < numcase; zz++){
				double C = sc.nextDouble();
				double F = sc.nextDouble();
				double X = sc.nextDouble();
				double ret;
				double temp = X/2;
				double speed = 2;
				double currTimeFarm = 0;
				do{
					ret = temp;
					double timeFarm = C/speed;
					currTimeFarm += timeFarm;
					speed += F;
					temp = currTimeFarm + (X/speed);
				}while(temp < ret);
				pw.printf("Case #%d: %.7f\n", zz+1, ret);
			}
			sc.close();
			pw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}

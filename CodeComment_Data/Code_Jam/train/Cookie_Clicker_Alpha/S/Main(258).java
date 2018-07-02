package methodEmbedding.Cookie_Clicker_Alpha.S.LYD213;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("e:\\B-small-attempt0.in"));

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i = 1; i<=n;i++){
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			
			double farmtime = 0;
			double power = 2;
			double time0 = X / power;
			double time1 = 0;
			
			do{
				farmtime += C / power;
				power += F;
				time1 = farmtime + X / power;
				if(time0 < time1){
					break;
				}
				
				time0 = time1;
			}while(true);
			
			System.out.format("Case #%d: %.7f", i, time0);
			System.out.println();
		}
		
		
	}
}

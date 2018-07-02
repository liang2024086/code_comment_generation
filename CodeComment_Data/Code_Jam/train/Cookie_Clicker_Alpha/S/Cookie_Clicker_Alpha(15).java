package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1090;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cookie_Clicker_Alpha {
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("B-small-attempt0.in");
		Scanner scanner = new Scanner(file);
		//Scanner scanner = new Scanner(System.in);
		
		int T = Integer.parseInt(scanner.next());
		
		for(int i = 1; i <= T; i++){
			double C = Double.parseDouble(scanner.next());
			double F = Double.parseDouble(scanner.next());
			double X = Double.parseDouble(scanner.next());
			
			double cps = 2;
			double sec = 0;
			outside:{
					while(true){
				
					sec += C / cps;
					
					double newcps = cps + F;
					
					if((X - C)/cps > X/newcps){
						cps = newcps;
					} else {
						break outside;
					}
				}
			}
			
			sec += (X - C) / cps;
			System.out.printf("Case #" + i + ": %1.7f\n", sec);
		}
	}
}

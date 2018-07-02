package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1118;

import java.util.Scanner;


public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numT = sc.nextInt();
		
		for(int xx = 1 ; xx<=numT;xx++){
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			
			double R = 2.0d;
			
			double total = 0.0d;
			total += C/2.0d;
			while(true)
			{
				double reset = X/(R+F);
				double without = (X-C)/R;
				
				if(reset < without)
				{
					R += F;
					total += C/R;
				}
				else
				{
					total += (X-C)/R;
					break;
				}
			}
			System.out.println("Case #"+xx+": " +total);
		}
		
		
	}
}

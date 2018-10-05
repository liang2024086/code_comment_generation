package methodEmbedding.Cookie_Clicker_Alpha.S.LYD658;

import java.io.*;
import java.util.*;
public class problemB {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		FileOutputStream out = new FileOutputStream("out.txt");
		int loop = sc.nextInt();
		
		for (int i = 0; i<loop; i++){
			double c,f,x;
			c = sc.nextFloat();
			f = sc.nextFloat();
			x = sc.nextFloat();
			double production = 2.0f; 
			double  currentTime, nextTime;
			double totalTime = 0.0f,answer = 0.0f;
			do {
				currentTime = x/production;
				nextTime = c/production + x / (production+f);
				if (nextTime> currentTime){
					answer = currentTime+totalTime;
				}else {
					totalTime+= c/production;
					production+=f;
				}
				
			}while (answer ==0);
			out.write(String.format("Case #%d: %.7f\n",  i+1, answer ).getBytes());
			System.out.println(String.format("Case #%d: %f %f %f  %.7f\n",  i+1,c, f, x, answer));

		}
		
	}
}

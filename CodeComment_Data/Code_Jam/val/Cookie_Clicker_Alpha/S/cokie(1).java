package methodEmbedding.Cookie_Clicker_Alpha.S.LYD36;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cokie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i, j, k, l ;

		int n = scn.nextInt();
		String[] answers = new String[n];
		for (i = 1; i <= n; i++) {
			double c,f,x,time=0.0,y=2.0;
			c=scn.nextDouble();
			f=scn.nextDouble();
			x=scn.nextDouble();
			
					while(x/y>((c/y)+x/(y+f))){
						
						time+=c/y;
							
						y+=f;
					}
					time+=x/y;
			answers[i-1]="Case #"+i+": "+String.format("%.8f",time);
			
			
			
		}
		try {
			FileWriter fw = new FileWriter("output.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for (k = 0; k < n; k++) {

				bw.append(answers[k]);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {

		}
	}

}

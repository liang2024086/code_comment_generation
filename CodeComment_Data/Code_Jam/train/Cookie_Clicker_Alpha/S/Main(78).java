package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1413;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner=new Scanner(new File("E:\\B-small-attempt2.in"));
		PrintWriter printWriter=new PrintWriter(new File("E:\\output.txt"));
		int T=scanner.nextInt();
		for (int i = 1; i <= T; i++) {
			double rate=2.0;
			double C=scanner.nextDouble();
			double F=scanner.nextDouble();
			double X=scanner.nextDouble();
			double res=X/rate;
			double t=0;
			int loop=(int)X;
			while(loop>=0) {
				double tmp=C/rate;
				rate=rate+F;
				t=t+tmp;
				tmp=t+X/rate;
				if(tmp<res){
					res=tmp;
				}
				loop--;
			} 
			printWriter.println("Case #"+i+": "+String.format("%.7f", res));
						
		}
		printWriter.close();
	}	 	 
}


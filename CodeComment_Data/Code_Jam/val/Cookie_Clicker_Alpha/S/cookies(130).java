package methodEmbedding.Cookie_Clicker_Alpha.S.LYD681;

import java.io.*;
import java.util.*;
public class cookies{
	public static void main(String args[]) throws FileNotFoundException{
		PrintWriter fout = new PrintWriter(new File("cooki.txt"));
		Scanner scan = new Scanner(new File("B-small-attempt0.in"));
		int tests = scan.nextInt();
		for(int i =1;i<=tests;i++){
			double farmCost = scan.nextDouble();
			double farmAdd = scan.nextDouble();
			double win = scan.nextDouble();
			double time = 0;
			double currentRate = 2;
			double newRate = currentRate+farmAdd;
			while(win/currentRate>farmCost/currentRate+win/newRate){
				time+=farmCost/currentRate;
				currentRate+=farmAdd;
				newRate+=farmAdd;
			}
			time+=win/currentRate;
			fout.print("Case #"+i+": ");
			fout.printf("%.7f", time);
			fout.println();
			fout.flush();
		}
	}
}

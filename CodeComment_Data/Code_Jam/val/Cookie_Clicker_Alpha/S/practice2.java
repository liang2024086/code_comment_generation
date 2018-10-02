package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1622;

import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
public class practice2 {
	public static void main(String[] args){
		try {
			Scanner sc = new Scanner(new File("input"));
			
			int N = sc.nextInt();
			
			int caseNum = 1;
			while (caseNum<=N){
				double C = sc.nextDouble();
				double F = sc.nextDouble();
				double X = sc.nextDouble();
				double curRate = 2;
				double total = 0;
				while (true){
					double rate = X/curRate;
					double nextR = X/(curRate+F);
					double cost = C/curRate;
					if (rate > (nextR+cost)){
						total = total + cost;
						curRate = curRate + F;
					}else{
						break;
					}
				}
				total = total + X/curRate;
		//	System.out.println(C);
			//System.out.println(F);
			//X = X+0.00001d;
			//System.out.println(new DecimalFormat("#.#######").format(X));
			String lol = new DecimalFormat("#.#######").format(total);
				System.out.println("Case #"+ caseNum + ": "+lol);
				
			
				caseNum++;
			}
			//System.out.println(new DecimalFormat("#.#######").format(2000f/3f));
		}catch (Exception e){
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1536;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new FileReader(args[0]));
		PrintWriter pw = new PrintWriter(new FileWriter("a.txt"));
		
		int caseCnt = sc.nextInt();
		for (int caseNum = 0; caseNum < caseCnt; caseNum++) {
			pw.print("Case #" + (caseNum + 1) + ": ");
			Double C = sc.nextDouble();
			Double F = sc.nextDouble();
			Double X = sc.nextDouble();

			Double currF = 2.0;
			Double tot = 0.0;
			
//			while(X - biscottini > 0 && (X - biscottini)/currF > (C/currF + (X - biscottini - C)/(currF + F)) ){
//					//(X - tot*currF)/currF > (C/currF + (X - C -tot*currF)/(currF + F))){
//				
//			//(X*currF- tot) >= C && ((X*currF-tot)/currF) > (C*currF + (X*currF - tot - C*currF)/(currF + F))){
//				biscottini += C;
//				tot += (C/currF);
//				currF += F;
//				
//			}
			Double a = X/currF;
			Double b = C/currF + X/(currF + F);
			while(a >= b){
				tot += C/currF;
				currF += F;
				a = X/currF;
				b = C/currF + X/(currF + F);
				
				
			}
			
			Double res = tot + a;
			pw.println(res);
		}

		pw.flush();
		pw.close();
		sc.close();

		
	}

}

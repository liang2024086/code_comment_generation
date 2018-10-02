package methodEmbedding.Cookie_Clicker_Alpha.S.LYD625;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		Scanner gimi = null;
		PrintWriter taket = null;
		try {
			gimi = new Scanner(new File("input"));
			taket = new PrintWriter(new File("output"));
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int T = gimi.nextInt();
		for(int c = 1; c <= T; c++) {
			double C = gimi.nextDouble();
			double F = gimi.nextDouble();
			double X = gimi.nextDouble();
			
			int n = 0;
			double current = 0;
			double next = C/2;
			while(current+X/(2+n*F) > next+X/(2+(n+1)*F)) {
				current = next;
				n++;
				next += C/(2+n*F);
			}
			
			taket.printf("Case #%d: %.7f%n",c,current+X/(2+n*F));
		}
		
		gimi.close();
		taket.close();
	}

}

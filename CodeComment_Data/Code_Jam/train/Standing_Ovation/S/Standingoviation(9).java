package methodEmbedding.Standing_Ovation.S.LYD640;


import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Standingoviation {

	public static void main(String[] args) throws IOException {

		FileInputStream in = new FileInputStream(
				"D:/works/java/j2k15/bin/j2k15/A-small-attempt0.in");
		Scanner s = new Scanner(in);
		PrintWriter out = new PrintWriter(new FileWriter(
				"D:/works/java/j2k15/bin/j2k15/sotrial.out"));

		int n = Integer.parseInt(s.next());
		for (int i = 1; i <= n; i++) {
			int smax=s.nextInt(),c=0,sum = 0,need = 0,totalneed=0;
			String p=s.next();
			for (int j = 0; j < p.length(); j++) {
				 c=Integer.parseInt(p.charAt(j)+"");
				 if(j==0) sum=c;
				 else{
					 if(sum>=j)
						 sum+=c;
					 else{
						 need=j-sum;
						 sum+=need;
						 sum+=c;
						 totalneed+=need;
					 }
				 }
				 //System.out.println(j+" "+sum+"  "+need+"  "+totalneed);
			}
			out.println("Case #"+i+": "+totalneed);
			System.out.println("Case #"+i+": "+totalneed);
		}
		out.close();
	}
}

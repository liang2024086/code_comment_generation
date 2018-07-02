package methodEmbedding.Cookie_Clicker_Alpha.S.LYD832;

import java.io.*;
import java.util.*;

public class Cookie{
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter (new File("./output.txt"));

		//Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new File("./sample.txt"));
		Scanner sc = new Scanner(new File("./small.txt"));
		//Scanner sc = new Scanner(new File("./large.txt"));
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++ ){
			pw.print("Case #"+ i + ": ");
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();

			int count = (int)Math.ceil( (X*F - 2*C) / (C*F)  -1);
			count = Math.max(count, 0);
			//pw.println(count);
			double sum = 0;
			for(int j = 0; j < count; j++){
				sum += C / ( j * F + 2 );
			}
			sum += X / (count  * F + 2);
			pw.println(sum);
		}
		pw.flush();
		pw.close();	
	}
}

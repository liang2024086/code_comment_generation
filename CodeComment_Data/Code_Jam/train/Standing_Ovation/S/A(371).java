package methodEmbedding.Standing_Ovation.S.LYD1910;

import java.util.*;
import java.io.*;

public class A {
	static PrintWriter pw;
	public static void main(String args[]) throws Exception{
		BufferedReader input = new BufferedReader(new FileReader("../GoogleCodeJam2015/io/A-small-attempt1.in"));
		pw = new PrintWriter(new FileWriter("../GoogleCodeJam2015/io/output.txt"));
		int T = Integer.parseInt(input.readLine());
		for(int i = 0 ; i < T ; i++){
			String[] shys = input.readLine().split(" ");
			int maxshy = Integer.parseInt(shys[0]);
			int addfriend = 0;
			int stand = 0;
			for(int j = 0 ; j <= maxshy ; j++){
				if(stand < j){
					addfriend += j - stand;
					stand += j - stand + Character.digit(shys[1].charAt(j), 10);
				}else{
					stand += Character.digit(shys[1].charAt(j), 10);
				}
			}
			pw.println("Case #"+(i+1)+": "+addfriend);
		}
		pw.flush();
		input.close();
		pw.close();
	}
}

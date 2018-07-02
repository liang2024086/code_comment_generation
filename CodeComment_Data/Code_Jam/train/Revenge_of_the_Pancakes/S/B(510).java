package methodEmbedding.Revenge_of_the_Pancakes.S.LYD805;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class B {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new File("B.out"));
		int T = in.nextInt();
		for (int t = 1; t <= T; t++) {
			String s = in.next();
			int flips = 0;
			boolean[] cakes = new boolean[s.length()];
			for(int i = 0; i < s.length(); i++){
				cakes[i] = s.charAt(i)=='+';
			}
			for(int i = cakes.length-1; i>=0; i--){
				if(i==cakes.length-1){
					if(!cakes[i]){
						flips++;
					}
				}else{
					if(cakes[i]!=cakes[i+1]){
						flips++;
					}
				}
			}
			out.printf("Case #%d: %d\n",t,flips);
		}
		out.close();
	}

}

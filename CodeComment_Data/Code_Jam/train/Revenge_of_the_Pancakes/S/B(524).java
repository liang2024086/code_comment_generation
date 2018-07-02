package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class B {
	
	

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("B-small.in"));
		PrintWriter out = new PrintWriter(new File("B_small.txt"));
		int T = in.nextInt();
		in.nextLine();
		for (int t =0; t<T; t++){
			String s = in.nextLine();
			int l = s.length();
			int count =0;
			if (s.charAt(l-1)=='-'){
				count++;
			}
			for (int j = l-2; j>=0; j--){
				if (s.charAt(j)!=s.charAt(j+1)){
					count++;
				}
			}
			out.println("Case #"+(t+1)+": "+count);
		}
		out.close();

	}

}

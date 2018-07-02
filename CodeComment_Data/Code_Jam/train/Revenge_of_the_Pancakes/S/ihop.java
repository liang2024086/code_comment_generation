package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1018;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ihop {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new File("ihop.out"));
		
		int T = scan.nextInt();
		for(int t = 1; t <= T; t++) {
			StringBuilder line = new StringBuilder( scan.next() );
			int N = line.length(), r = N-1;
			
			while(r>=0)
				if(line.charAt(r)=='+')r--;
				else break;
			
			if(r<0){
				out.println("Case #"+t+": "+0);
				continue;
			}
			int count = 1;
			char prev = line.charAt(0);
			for(int i=1;i<=r;i++){
				if(line.charAt(i)!=prev){
					count++;
					prev=line.charAt(i);
				}
			}
			out.println("Case #"+t+": "+count);
			
		}
		out.close();
	}
}

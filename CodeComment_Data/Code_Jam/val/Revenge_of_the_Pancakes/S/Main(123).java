package methodEmbedding.Revenge_of_the_Pancakes.S.LYD880;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("b.in"));
	//	Scanner s = new Scanner(System.in);
		BufferedWriter out = new BufferedWriter(new FileWriter("b.out"));
		int T = s.nextInt();
		s.nextLine();
		for(int i=1; i<=T; i++){
			String str = s.nextLine();
			char lastCh = '.';
			int ans=0;
			int last;
			for (last=str.length()-1; last>=0;){
				if(str.charAt(last)=='+') last--;
				else break;
			}
			for (int j = 0; j < last+1; j++) {
				if(str.charAt(j)!=lastCh) ans++;
				lastCh=str.charAt(j);
			}
			out.write("Case #"+i+": "+ans+"\n");
		}
		out.close();
	}
}

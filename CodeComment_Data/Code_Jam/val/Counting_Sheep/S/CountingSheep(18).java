package methodEmbedding.Counting_Sheep.S.LYD1015;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new FileReader("A-small-attempt1.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		boolean[] occur = new boolean[10];
		boolean[] goal = new boolean[10];
		Arrays.fill(goal, true);
		int trial = s.nextInt();
		assert trial>0 && trial<101;
		for(int i=0;i<trial;i++){
			Arrays.fill(occur, false);
			int num =s.nextInt();
			assert num>=0;
			if(num==0){
				pw.println(String.format("Case #%d: INSOMNIA", i+1));
			} else {
				int jnum = 0;
				for(int j=1;!Arrays.equals(occur, goal);j++){
					jnum = j*num;
					int temp = jnum;
					for(int k=String.valueOf(jnum).length();k>0;k--){
						int l = (int)Math.pow(10, k-1);
						occur[temp/l] = true;
						temp%=l;
					}
				}
				pw.println(String.format("Case #%d: %d", i+1, jnum));
			}
			
		}
		s.close();
		pw.close();
	}

}

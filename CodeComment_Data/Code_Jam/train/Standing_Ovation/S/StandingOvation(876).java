package methodEmbedding.Standing_Ovation.S.LYD835;

import java.util.*;
import java.io.*;

public class StandingOvation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.valueOf(br.readLine());
		for(int ctr=0; ctr<cases; ctr++) {
			String[] ss = br.readLine().split("\\s+");
			int levels = Integer.valueOf(ss[0]);
			int[] shyness = new int[levels+1];
			for(int i=0; i<levels+1; i++) {
				shyness[i] = Integer.valueOf(""+ss[1].charAt(i));
			}
			int run = 0;
			int invited = 0;
			for(int i=0; i<levels+1; i++){
				if(run < i) {
					invited += i - run;
					run += i - run;
				}
				run += shyness[i];
			}
			System.out.printf("Case #%d: %d\n", ctr+1, invited);
		}
	}
}

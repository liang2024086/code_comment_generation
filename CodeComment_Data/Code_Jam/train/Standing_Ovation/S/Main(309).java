package methodEmbedding.Standing_Ovation.S.LYD819;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
	
	public Main(String fname){
		Scanner s = null;
		try {
			s = new Scanner(new File(fname));
		} catch (IOException e) {
			e.printStackTrace();
		}
		int t = s.nextInt();
		int cse = 1;
		for(int x=0; x<t; x++){
			int smax = s.nextInt();
			int currentClapping = 0;
			int needed = 0;
			String nums = s.nextLine().substring(1);
			for(int i=0; i<=smax; i++){
				int ppl = new Integer(nums.substring(i, i+1));
				if(i - currentClapping > needed){
					needed = i - currentClapping;
				}
				currentClapping += ppl;	
			}
			System.out.printf("Case #%d: %d\n",cse, needed);
			cse++;
		}
	}

	public static void main(String[] args) {
		new Main(args[0]);
	}

}

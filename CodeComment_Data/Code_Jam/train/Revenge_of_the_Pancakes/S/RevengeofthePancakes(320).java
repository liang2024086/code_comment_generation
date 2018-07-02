package methodEmbedding.Revenge_of_the_Pancakes.S.LYD772;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rvisweswaran on 4/8/16.
 */
public class RevengeofthePancakes {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("input.txt"));
		FileWriter fw = new FileWriter(new File("output.txt"));
		int T = sc.nextInt();
		for(int t=1; t<=T; t++)
		{
			String S = new StringBuilder(sc.next()).reverse().toString();
			char prev = '+';
			int tot = 0;
			for(char c : S.toCharArray())
			{
				if(c!=prev)
				{
					tot++;
					prev = c;
				}
			}
			fw.write("Case #"+t+": "+tot+"\n");
		}
		fw.flush();
		fw.close();
		sc.close();
	}

}

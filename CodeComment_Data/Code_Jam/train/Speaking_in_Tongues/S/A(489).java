package methodEmbedding.Speaking_in_Tongues.S.LYD1598;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class A {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static String sampleIn = "aoz ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
	public static String sampleOut = "yeq our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] map = new int[26];
		boolean[] taken = new boolean[26];
		for(int i = 0; i < sampleIn.length(); i++){
			if(sampleIn.charAt(i) != ' '){
				map[sampleIn.charAt(i) - 'a'] = sampleOut.charAt(i) - 'a' + 1;
				taken[sampleOut.charAt(i) - 'a'] = true;
			}
		}
		outer:
		for(int i = 0; i < map.length; i++){
			if(map[i]==0){
				for(int j = 0; j < taken.length; j++){
					if(!taken[j]){
						map[i] = j + 1;
						break outer;
					}
				}
			}
		}
		Scanner scan = new Scanner(new File("A-small-attempt0.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("A.out"));
		int t = Integer.parseInt(scan.nextLine());
		for (int i = 1; i <= t; i++) {
			String input = scan.nextLine();
			String output = "";
			for(int j = 0; j < input.length(); j++){
				if(input.charAt(j) == ' '){
					output += input.charAt(j);
				}else{
					output += (char)(map[input.charAt(j) - 'a'] - 1 + 'a');
				}
			}
			out.write("Case #" + i + ": "+ output + "\n");
		}
		out.close();
	}
}

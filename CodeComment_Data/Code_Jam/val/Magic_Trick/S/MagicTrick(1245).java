package methodEmbedding.Magic_Trick.S.LYD1599;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;


public class MagicTrick {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		StringTokenizer sz = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(sz.nextToken());
		for(int c = 1; c <= t; c++) {
			sz = new StringTokenizer(br.readLine());
			int firstRow = Integer.parseInt(sz.nextToken());
			int [] num = new int[17];
			for(int i = 1; i <= 4; i++) {
				sz = new StringTokenizer(br.readLine());
				if(i == firstRow) {
					for(int j = 0; j < 4; j++) {
						num[Integer.parseInt(sz.nextToken())] = 1;
					}
				}
			}
			sz = new StringTokenizer(br.readLine());
			int secondRow = Integer.parseInt(sz.nextToken());
			int count = 0;
			int exactMatch = -1;
			for(int i = 1; i <= 4; i++) {
				sz = new StringTokenizer(br.readLine());
				if(i == secondRow) {
					for(int j = 0; j < 4; j++) {
						int val = Integer.parseInt(sz.nextToken());
						if(num[val] == 1) {
							exactMatch = val;
							count++;
						}
					}
				}
			}
			if(count == 1) {
				result.append("Case #"+ c + ": "+exactMatch+"\n");
			}
			else if(count > 1) {
				result.append("Case #"+ c + ": Bad magician!\n");
			}
			else {
				result.append("Case #"+ c + ": Volunteer cheated!\n");
			}
		}
		System.out.println(result);
	}
}

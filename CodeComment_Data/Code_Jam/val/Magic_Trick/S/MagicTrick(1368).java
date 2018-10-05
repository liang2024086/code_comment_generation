package methodEmbedding.Magic_Trick.S.LYD1126;

import java.util.*;
import java.io.*;
public class MagicTrick {
	static int size = 4;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder out = new StringBuilder();
		int T = in.nextInt();
		int case_num = 0;
		int row1, row2;
		int[] first = new int[4];
		int[] second = new int[4];
		while(case_num++<T) {
			row1 = in.nextInt() - 1;
			Arrays.fill(first, -1);
			Arrays.fill(second, -1);
			for(int i = 0; i < size; i++) {
				for(int k = 0; k < size; k++) {
					if(i == row1) {
						first[k] = in.nextInt();
						continue;
					}
					int temp = in.nextInt();
				}
			}
			row2 = in.nextInt() - 1;
			for(int i = 0; i < size; i++) {
				for(int k = 0; k< size; k++) {
					if(i == row2) {
						second[k] = in.nextInt();
						continue;
					}
					int temp = in.nextInt();
				}
			}
			int count = 0;
			int magicNum = 0;
			for(int i = 0; i < size; i++) {
				for(int k = 0; k < size; k++) {
					if(first[i] == second[k]) {
						count++;
						magicNum = first[i];
					}
				}
			}
			out.append("Case #"+ case_num + ": ");

			if(count > 1) {
				out.append("Bad magician!\n");
			}
			else if(count == 1) {
				out.append(magicNum +"\n");
			}
			else {
				out.append("Volunteer cheated!\n");
			}
		}
		System.out.print(out.toString());
	}
}

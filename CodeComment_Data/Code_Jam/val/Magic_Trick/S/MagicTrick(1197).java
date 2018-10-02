package methodEmbedding.Magic_Trick.S.LYD1308;

import java.util.*;
import java.io.*;

public class MagicTrick {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream(new BufferedOutputStream(System.out));
		int cases = Integer.valueOf(sc.nextLine());
		for(int ctr=0; ctr<cases; ctr++){
			int r = Integer.valueOf(sc.nextLine())-1;
			TreeSet<Integer> set = new TreeSet<Integer>();
			TreeSet<Integer> set2 = new TreeSet<Integer>();
			for(int i=0; i<4; i++){
				String s = sc.nextLine();
				if(i==r){
					String[] ss = s.split("\\s+");
					for(int j=0; j<4; j++){
						set.add(Integer.valueOf(ss[j]));
					}
				}
			}
			r = Integer.valueOf(sc.nextLine())-1;
			for(int i=0; i<4; i++){
				String s = sc.nextLine();
				if(i==r){
					String[] ss = s.split("\\s+");
					for(int j=0; j<4; j++){
						set2.add(Integer.valueOf(ss[j]));
					}
				}
			}
			int answer = -1;
			int count = 0;
			for(int i : set){
				for(int j : set2){
					if(i == j){
						answer = i;
						count++;
					}
				}
			}

			if(count == 0){
				ps.printf("Case #%d: Volunteer cheated!\n", ctr+1);
			}else if(count > 1){
				ps.printf("Case #%d: Bad magician!\n", ctr+1);
			}else {
				ps.printf("Case #%d: %s\n", ctr+1, answer);
			}
		}
		ps.flush();
	}
}

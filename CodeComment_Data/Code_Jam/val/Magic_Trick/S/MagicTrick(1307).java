package methodEmbedding.Magic_Trick.S.LYD1692;

import java.util.*;

public class MagicTrick {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		int cas = 1;
		while(t --> 0){
			boolean[] p = new boolean[16];
			boolean[] q = new boolean[16];
			int a = reader.nextInt()-1;
			for(int i = 0; i < 4; i++)
				for(int j = 0; j < 4; j++)
					p[reader.nextInt()-1] |= i==a;
			a = reader.nextInt()-1;
			for(int i = 0; i < 4; i++)
				for(int j = 0; j < 4; j++)
					q[reader.nextInt()-1] |= i==a;
			int cnt = 0;
			int ans = -1;
			for(int i = 0; i < 16; i++)
				if(p[i]&q[i]){
					cnt++;
					ans = i;
				}
			System.out.print("Case #"+cas+++": ");
			if(cnt > 1){
				System.out.println("Bad magician!");
			}else if(cnt == 1){
				System.out.println(ans+1);
			}else{
				System.out.println("Volunteer cheated!");
			}
		}
	}
}

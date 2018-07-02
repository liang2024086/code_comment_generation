package methodEmbedding.Counting_Sheep.S.LYD354;

import java.util.Scanner;


public class qualification_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T;
		T = scan.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N, cur, sup = 1;
			N = scan.nextInt();
			cur = N;
			if(N == 0) {
				System.out.println("Case #" + tc + ": INSOMNIA");
			} else {
				boolean flg = false;
				boolean chck[] = new boolean[10];
				for(int i=0;i<10;i++) chck[i] = false;
				String str = Integer.toString(cur);
				
				for(int i=0;i<str.length();i++) {
					chck[str.charAt(i)-'0'] = true;
				}
				for(int i=0;i<10;i++) {
					if(chck[i] == false) {
						break;
					} else if(i == 9){
						flg = true;
					}
				}
				while(!flg) {
					sup++;
					cur = N * sup;
					str = Integer.toString(cur);
					for(int i=0;i<str.length();i++) {
						chck[str.charAt(i)-'0'] = true;
					}
					for(int i=0;i<10;i++) {
						if(chck[i] == false) {
							break;
						} else if(i == 9){
							flg = true;
						}
					}
				}
				System.out.println("Case #" + tc + ": " + cur);
			}
		}
	}

}

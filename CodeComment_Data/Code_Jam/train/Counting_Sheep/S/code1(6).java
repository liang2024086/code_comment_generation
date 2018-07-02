package methodEmbedding.Counting_Sheep.S.LYD1438;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i=1;i<=num;i++){
			int n = in.nextInt();
			if(n==0){
				System.out.println("Case #"+i+": INSOMNIA");
				continue;
			}
			boolean [] b = new boolean[10];
			boolean all = false;
			int cur = 0;
			int mulnum = 1;
			while(true){
				if(all){
					System.out.println("Case #"+i+": "+cur);
					break;
				}
				cur = n * mulnum;
				mulnum++;
				int cpcur = cur;
				while(cpcur>0){
					int gewei = cpcur%10;
					b[gewei] = true;
					cpcur = cpcur/10;
				}
				int cnt_f=10;
				for(boolean bb:b){
					if(bb) cnt_f--;
				}
				if(cnt_f==0){
					all = true;
				}
			}
		}
	}
}

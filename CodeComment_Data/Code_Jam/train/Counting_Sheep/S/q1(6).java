package methodEmbedding.Counting_Sheep.S.LYD439;

import java.util.*;
class q1
{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int t=T;
		int x=0;
		while(T-- > 0) {
			int N = in.nextInt();
			boolean numCheck[] = new boolean[10];
			int countCheck = 0;
			int lastNum= N;
			int n = N;
			if(N == 0) {
				System.out.println("Case #"+(t-(T))+": INSOMNIA");
				continue;
			}
			while(countCheck !=10){
				int temp = n;
				int rem = 0;
				while(temp > 0) {
					rem = temp%10;
					temp = temp/10;
					if(numCheck[rem] == false) {
						numCheck[rem] = true;
						countCheck++;
					}
					
				}
				lastNum = n;
				n += N;
			}	
		System.out.println("Case #"+(t-(T))+": "+lastNum);
		
		}
	}
}

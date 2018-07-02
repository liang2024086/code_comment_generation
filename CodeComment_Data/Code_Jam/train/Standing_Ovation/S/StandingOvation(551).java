package methodEmbedding.Standing_Ovation.S.LYD1615;


import java.util.Arrays;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int [] au = new int[1001];
		for(int t = 1; t<=T ; t++){
			Arrays.fill(au, 0);
			int S = in.nextInt();
			String line = in.nextLine();
			for(int s=0; s<=S; s++)
				au[s]=line.charAt(s+1)-'0';
			int need = 0;
			int now = au[0];
			for(int s = 1; s<=S; s++){
				if(now<s){
					need+=s-now;
					now=s;
				}
				now+=au[s];
			}
			System.out.println("Case #"+t+": "+need);
		}
		in.close();
	}

}

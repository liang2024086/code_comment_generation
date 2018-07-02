package methodEmbedding.Revenge_of_the_Pancakes.S.LYD391;

import java.util.Scanner;

public class ROFP
{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		int T=s.nextInt();
		int cnt=0;

		while(cnt < T){
			String panc = s.next();
			int res = 0;

			for(int i=1; i<panc.length(); i++){
				if(panc.charAt(i-1) != panc.charAt(i)){
					res++;
				}
			}

			if(panc.charAt(panc.length()-1) == '-'){
				res++;
			}

			System.out.println("Case #"+(cnt+1)+": "+res);

			cnt++;
		}
	}
}

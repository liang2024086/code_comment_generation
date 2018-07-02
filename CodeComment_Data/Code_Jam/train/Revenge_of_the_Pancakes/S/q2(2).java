package methodEmbedding.Revenge_of_the_Pancakes.S.LYD312;

import java.util.*;
class q2
{
	public static void main(String args[]) {
		Scanner st = new Scanner(System.in);
		int T = Integer.parseInt(st.nextLine());
		int t=T;
		int x=0;
		while(T-- > 0) {
			String N = st.nextLine();
			int count = 0;
			for(int i = N.length() - 1; i>=0;i--) {
				if(N.charAt(i) == '-'){
					count++;
					String temp="";
					for(int j = 0;j<=i-1;j++ ) {
						if(N.charAt(j) == '+')
							temp = temp+"-";
						else
							temp = temp + "+";
					}
					N = temp ; // no need to append + at end it doesnt make a difference
				}
			}
			
		System.out.println("Case #"+(t-(T))+": "+count);
		
		}
	}
}

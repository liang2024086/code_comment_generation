package methodEmbedding.Revenge_of_the_Pancakes.S.LYD309;

import java.util.*;
public class problemB {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt() ;
		int Case = 1;
		while(T-- > 0){
			StringBuilder sb = new StringBuilder(sc.next());
			
			int ans = 0 ;
			while(true){
			char c = sb.charAt(0);
			int i = 0;
			for(i = 0 ; i < sb.length() ; i++){
				if(sb.charAt(i) != c)
					break;
				
			}
			if(i == sb.length()){
				if(c == '+')
					System.out.println("Case #"+ Case + ": " + ans);
				else
					System.out.println("Case #"+ Case + ": " + (ans+1));
				break ;
			}
			
			char opp = ( c == '+' ?'-' : '+' );
			for(int j = 0 ; j < i ; j++)
				sb.setCharAt(j, opp);
			ans++ ;
			}
			Case++ ;
		}
		sc.close();
	}
}

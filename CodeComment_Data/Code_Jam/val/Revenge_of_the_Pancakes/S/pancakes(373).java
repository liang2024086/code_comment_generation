package methodEmbedding.Revenge_of_the_Pancakes.S.LYD422;

import java.util.*;
public class pancakes {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i =1; i<t+1; i++){
			String s = in.next();
			int c = 0;
			for(int j = 0; j<s.length()-1; j++){
				if(s.charAt(j) != s.charAt(j+1)){
					c++;
				}
			}
			if(s.charAt(s.length()-1) == '-'){
				c++;
			}
			
			System.out.println("Case #"+i+":"+" "+c);
		}
	}
}

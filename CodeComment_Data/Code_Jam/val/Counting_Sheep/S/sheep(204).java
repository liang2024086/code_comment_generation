package methodEmbedding.Counting_Sheep.S.LYD229;

import java.util.*;

public class sheep {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 1; i<t+1; i++){
			int n = in.nextInt();
			if(n == 0){
				System.out.println("Case #"+i+":"+" "+"INSOMNIA");
			}
			else{
				int x = n;
				List<Character> digits = new ArrayList<Character>();
				while(digits.size() < 10){
					String s = Integer.toString(x);
					for(int c = 0; c<s.length(); c++){
						if(!digits.contains(s.charAt(c))){
							digits.add(s.charAt(c));
						}
					}
					x += n;
				}
				x -= n;
				System.out.println("Case #"+i+":"+" "+x);
			}
		}
	}
}

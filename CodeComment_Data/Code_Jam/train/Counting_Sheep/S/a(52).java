package methodEmbedding.Counting_Sheep.S.LYD526;

import java.util.*;
public class a {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int z = 1;z<=t;z++){
			int n = in.nextInt();
			String result = "INSOMNIA";
			if(n!=0){
				//System.out.println("Common dude");
				Set<Character> s = new HashSet<>();
				int i= 0;
				long next = 1;
				while(true){
					//System.out.println(s);
					next = n*(++i);
					for(char c: (next + "").toCharArray()){
						s.add(c);
					}
					if(s.size()==10){
						result = next + "";
						break;
					}
				}
			}
			System.out.println("Case #"+z+": " + result);
		}
	}
}

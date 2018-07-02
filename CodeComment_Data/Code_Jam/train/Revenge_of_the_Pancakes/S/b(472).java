package methodEmbedding.Revenge_of_the_Pancakes.S.LYD318;

import java.util.*;
public class b {
	public static void main(String[] args){
		Scanner br = new Scanner(System.in);
		int t = br.nextInt();
		for(int c = 1;c<=t;c++){
			String line = br.next();
			int n = line.length();
			int ans = 0;
			char last = 'a';
			for(int i = 0;i<n;i++){
				if(line.charAt(i) == '-'){
					if(last != '-'){
						ans++;
					}
					if(last == '+'){
						ans++;
					}
				}
				last = line.charAt(i);
			}
			System.out.println("Case #"+c+": "+ans);
		}
	}
}


package methodEmbedding.Standing_Ovation.S.LYD317;

import java.util.*;
public class a {
	public static void main(String[] args){
		Scanner br = new Scanner(System.in);
		int t = br.nextInt();
		for(int c = 1;c<=t;c++){
			int n = br.nextInt();
			String s = br.next();
			int am = 0;
			int ans = 0;
			for(int i = 0;i<s.length();i++){
				int cc = s.charAt(i)-'0';
				if(cc > 0){
					if(am < i){
						ans+=i-am;
						am = i;
					}
					am+=cc;
				}
			}
			System.out.println("Case #"+c+": "+ans);
		}
	}
}

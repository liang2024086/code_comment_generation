package methodEmbedding.Revenge_of_the_Pancakes.S.LYD562;

import java.math.BigInteger;
import java.util.Scanner;

public class pancake {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int q=1; q<=cases; q++){
			StringBuilder s = new StringBuilder(in.next());
		//	System.out.println(s);
			System.out.print("Case #"+q+": ");
			int tot = 0;
			s=new StringBuilder(s.substring(0, s.lastIndexOf("-")+1));
	//		System.out.println(s.toString());
			for(;s.length()>0;){
		//		System.out.println(s.toString());
				if(s.charAt(0)=='+'){
					tot++;
					for(int i =0; i<s.length(); i++){
						if(s.charAt(i)=='+'){
							s.setCharAt(i, '-');
						}
						else{
							break;
						}
					}
				}
				String st = s.toString();
		//		System.out.println(st+" B");
				int ind = st.indexOf("+");
				if(ind==-1){
					tot++;
					break;
				}
				
				tot++;
		//		System.out.println(st+" A");
				StringBuilder sb = new StringBuilder(st);
				s=sb.reverse();
				for(int i =0; i<s.length(); i++){
					if(s.charAt(i)=='+'){
						s.setCharAt(i, '-');
					}
					else{
						s.setCharAt(i, '+');
					}
				}
				s=new StringBuilder(s.substring(0, s.lastIndexOf("-")+1));
		//		System.out.println(s.toString()+" C");
			}
			System.out.println(tot);
		}
	}
}

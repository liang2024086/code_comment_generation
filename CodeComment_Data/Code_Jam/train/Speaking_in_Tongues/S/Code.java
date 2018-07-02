package methodEmbedding.Speaking_in_Tongues.S.LYD781;

import java.util.Scanner;


public class A {
	
	
	public static void main(String[] argv){
		Scanner in = new Scanner ( System.in );
		System.out.println();
		String Ind="abcdefghijklmnopqrstuvwxyz";
		String Rep="ynficwlbkuomxsevqpdrjgthaz";
		int[] t=new int[26];
		for(int i=0; i<26; i++)
			t[i]=Rep.charAt(i)-'a';
		
		int T=Integer.parseInt(in.nextLine());
		
		for(int i=0; i<T; i++){
			String s=in.nextLine();		
			String r="";
			for(int k=0; k<s.length(); k++){
				if(s.charAt(k)==' ')
					r+=" ";	
				else{
					for(int q=0; q<26; q++){
						if(s.charAt(k)==Rep.charAt(q)){
							r+=Ind.charAt(q);
							break;
						}
					}
				}
				//r+=Rep.charAt(s.charAt(k)-'a');
			}
			System.out.println("Case #"+(i+1)+": "+r);
		}
		
	}

}

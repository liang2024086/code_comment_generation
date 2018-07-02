package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1157;

import java.util.Scanner;

class RevengeOfThePancakes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		char[] s;
		int c,count;
		for (int i = 1; i <= T; i++) {
			s=sc.next().toCharArray();
			c=1;
			
			if(s[0]=='+'){
				count=0;
			}
			else{
				count=1;
				while(c<s.length && s[c]=='-'){
					c++;
				}
			}
			
			while(c<s.length){
				if(s[c]=='+'){
					c++;
				}
				else{
					count+=2;
					c++;
					while(c<s.length && s[c]=='-'){
						c++;
					}
				}
			}
			System.out.println("Case #"+i+": "+count);
		}
		sc.close();
	}

}

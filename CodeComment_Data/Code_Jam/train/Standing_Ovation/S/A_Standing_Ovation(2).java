package methodEmbedding.Standing_Ovation.S.LYD284;


import java.util.Scanner;

public class A_Standing_Ovation {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int index =0;
		while(index++ < t){
			int sMax = in.nextInt();
			String p = in.next();
			char [] pChar = p.toCharArray(); 
			
			int friends = 0;
			long sScore = 0;
			
			int k = 0;
			for(char ch : pChar ){
				int n = ch-'0' ;
				if(k>sScore && n>0){
					friends +=k-sScore;
					sScore +=k-sScore;
				}
				sScore+=n;
				k++;
			}
			
			System.out.println("Case #"+index+": "+friends);
		}
	}

}


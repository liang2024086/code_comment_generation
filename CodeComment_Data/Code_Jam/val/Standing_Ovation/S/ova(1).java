package methodEmbedding.Standing_Ovation.S.LYD426;

import java.util.Scanner;
public class ova{
	public static void main(String[] args){
		Scanner sysIn = new Scanner(System.in);
		int n = sysIn.nextInt();
		for(int i=1;i<=n;i++){
			int dummy = sysIn.nextInt();
			String aud = sysIn.next();
			int numNeeded = 0;
			int numHave = 0;
			for(int j=0;j<aud.length();j++){
				if(numHave < j){
					numNeeded+= j-numHave;
					numHave+= j-numHave;
					//System.out.println(numNeeded+" "+numHave);
				}
				numHave+= aud.charAt(j) - '0';
			}
			System.out.println("Case #"+i+": "+numNeeded);
		}
	}
}

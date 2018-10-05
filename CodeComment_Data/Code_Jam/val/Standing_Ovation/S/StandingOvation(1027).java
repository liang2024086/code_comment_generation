package methodEmbedding.Standing_Ovation.S.LYD1501;

import java.util.Scanner;


public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i=0; i<T; i++){
			int smax = in.nextInt();
			String s = in.next();
			char [] sc = s.toCharArray();
			int [] si = new int[s.length()];
			int cSum = 0;
			int fN = 0;
			int fNfork=0;
			for(int j=0; j<s.length(); j++){
				si[j] = sc[j]-'0';
				if(si[j] != 0)
				if(cSum >= j){
					cSum += si[j];
				}else{
					fNfork = j - cSum;
					fN += fNfork;
					cSum += si[j] + fNfork;
					
				}
				//System.out.println(j + " " + si[j] + " " + fNfork);
				fNfork = 0;
			}
			System.out.println("Case #"+(i+1)+": "+fN);
		}
		
		in.close();
	}

}

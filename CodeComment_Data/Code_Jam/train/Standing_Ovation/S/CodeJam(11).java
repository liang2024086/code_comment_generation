package methodEmbedding.Standing_Ovation.S.LYD710;


import java.util.Scanner;

public class CodeJam {
	public static void main(String args[]){
		Scanner sc= new Scanner	(System.in);
		int T=sc.nextInt();
		for(int t=1; t<=T; t++){
			int maxShyness=sc.nextInt();
			String shynessSeq=sc.next();
			int length=maxShyness+1;			
			int[] shynessArr=new int[length];
			if(length!=shynessSeq.length()){
				System.out.println("Invalid Input");
				continue;
			}
			int peopleNeeded=0;
			for(int i=0;i<length;i++){
				shynessArr[i]=Character.getNumericValue(shynessSeq.charAt(i));

			}
			for(int i=0;i<length;i++){
				int sum=0;
				for(int j=0;j<i;j++){
					sum+=shynessArr[j];
				}				
				if(i>sum){
					peopleNeeded+=i-sum;
					shynessArr[i]+=i-sum;
				}

			}
			System.out.println("Case #"+t+": "+peopleNeeded);
		}
	}
}

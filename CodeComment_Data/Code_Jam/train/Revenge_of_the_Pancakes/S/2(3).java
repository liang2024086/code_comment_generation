package methodEmbedding.Revenge_of_the_Pancakes.S.LYD544;

import java.util.Scanner;


public class PancakeFlip {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		in.nextLine();
		for(int i=0;i<testCases; i++){
			String input = in.nextLine();
			int length = input.length();
			boolean foundIndividualMinus = false;
			int j = length-1;
			int count =0;
			while(j>=0){
				if(input.charAt(j)=='-'){
					if(foundIndividualMinus){
						
					}else{
						foundIndividualMinus = true;
					}
				}else{
					if(!foundIndividualMinus){
						
					}else{
						count += 2;
						foundIndividualMinus = false;
					}
				}
				j--;
			}
			
			if(foundIndividualMinus){
				count +=1;
			}
			int testNumber = i+1;
			System.out.println("Case #"+testNumber+": "+count);
		}
		
	}
}

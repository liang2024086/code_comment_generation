package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1060;


import java.util.Scanner;

public class RevengeOfPancackes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		char h = '+', b = '-';
		for(int t=0;t<T;t++){
			
			String input = s.next();
			int i=0,j=0;
			int count = 0;
			boolean toFlip = false;
			boolean loopExecuted = false;
			// positioning i and j initially.
			while(j<input.length()&&input.charAt(j)==b ){
				j++;
				loopExecuted = true;
			}
			if(loopExecuted)
				count++;
			i=j;
			j++;
			while(j<input.length()){
				
				if(input.charAt(j)==h){
					i++;
					j++;
					if(toFlip){
						count+=2;
					  toFlip = false;
					}
				}
				
				else{
					j++;
					toFlip = true;
					
					if(j==input.length())
						count+=2;
				}
				
			}
			
			System.out.println("Case #"+(t+1)+": "+count);
		}
	}

}

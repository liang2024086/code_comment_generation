package methodEmbedding.Counting_Sheep.S.LYD141;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) {
		
		int T,N;
		
		
		Set<Integer> allDigits =new HashSet<Integer>(10);
		
		Scanner s = new Scanner(System.in);
		T=s.nextInt();
		for(int i=0;i<T;i++){
			allDigits.clear();
			
			N=s.nextInt();
			if(N==0){
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
			
			else{
				int j=1;
			
			while(allDigits.size()!=10){
				int M=N*j;
				char[] digits1 = String.valueOf(M).toCharArray();
				
				for(int k=0;k<digits1.length;k++){
					allDigits.add((int) digits1[k]-48);			
				}
				j++;				
				
			}
			
			System.out.println("Case #"+(i+1)+": "+(j-1)*N);
		}
		}
		
		
		s.close();
		}
	

}

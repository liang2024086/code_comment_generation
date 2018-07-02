package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1103;

import java.util.Scanner;

public class Jam {
	
	

	public static void main(String[] args) {
		
		Scanner lo= new Scanner(System.in);

		int loop=lo.nextInt();
		for(int k=0;k<loop;k++){
	    String ab=lo.next();

		int len= ab.length();
		int count=0;
		if(ab.charAt(0)=='-')
			count++;
		
		for(int i=1;i<len;i++){
			
			if(ab.charAt(i-1)=='+' && ab.charAt(i)=='-')
				count=count+2;
			
			
			
			
			
			
		}
		System.out.println("Case #"+(k+1)+": "+count);
		
		}
		
		
		
		
		
		

	}

}

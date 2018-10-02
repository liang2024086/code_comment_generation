package methodEmbedding.Revenge_of_the_Pancakes.S.LYD477;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
		int l=0;
		while(t-->0){
			l++;
			String s=sc.next();
			char arr[]=new String(new StringBuffer(s).reverse()).toCharArray();
			int c=0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]=='-'){
					c++;
					for (int j = i; j < arr.length; j++) {
						arr[j]=(arr[j]=='+')?'-':'+';
						
					}
				}
				
			}
			System.out.printf("Case #%d: %d\n",l,c);
			
		}
		
		
		
	}

}

package methodEmbedding.Revenge_of_the_Pancakes.S.LYD704;

import java.io.*;
import java.util.*;

class PankCakes{
	public static void main(String args[])throws IOException{
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		int k,i;
		String stack;
		
		for(k=1;k<=t;k++){
			stack = sc.next();
			int count = 0;
			int len = stack.length();
			
			for(i=0;i<len-1;i++){
				if(stack.charAt(i)!=stack.charAt(i+1)){
					count++;
				}
			}
			if(stack.charAt(len-1)=='-'){
				count++;	
			}
			System.out.println("Case #"+k+": "+count);
		}
	}
}

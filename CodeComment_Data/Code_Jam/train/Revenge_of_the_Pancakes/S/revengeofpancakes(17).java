package methodEmbedding.Revenge_of_the_Pancakes.S.LYD718;


import java.util.Scanner;

public class revengeofpancakes {
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		int x=scan.nextInt();
		
		
		for(int i=0;i<x;i++){
			int y=0;
			String z=scan.next();
			
			char temp='-';
			if (z.charAt(0)=='-'){
				y++;
			}
			for(int j=0;j<z.length();j++){
				char bc=z.charAt(j);
				if (bc==temp){
					
				}
				else{
					if(temp=='+'){
						y=y+2;
					}
					
				}
				temp=bc;
			}
			
			
			System.out.println("Case #"+(i+1)+": "+y);
		}
	}
}

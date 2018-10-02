package methodEmbedding.Revenge_of_the_Pancakes.S.LYD517;

import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int nn = sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=nn;i++){
			String s = sc.nextLine();
			int count = 0;
			s=s+'+';
			if(s.charAt(0)=='-' ) count =1;
			try{
				for(;;){
				int x = s.indexOf('+');
				if(s.charAt(x+1)=='-') count+=2;
				s=s.substring(x+1);
				}
			}
				catch(Exception e){
					System.out.println("Case #" + i + ": " + count);
				}
			}
		sc.close();
	}
}

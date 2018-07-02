package methodEmbedding.Revenge_of_the_Pancakes.S.LYD54;

import java.util.Scanner;


public class Second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 1; x <= t; x++) {
			int z=0;
			String s=sc.next();
			int i;
			for(i=0;i<s.length()-1;i++){
				if(s.charAt(i)!=s.charAt(i+1))
					z++;
			}
			
			if(s.charAt(s.length()-1)=='-')
			System.out.println("Case #"+x+": "+(z+1));
			else
				System.out.println("Case #"+x+": "+z);
				
			
		}
			
		}

}

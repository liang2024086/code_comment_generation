package methodEmbedding.Revenge_of_the_Pancakes.S.LYD11;


import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = Integer.parseInt(scn.nextLine());
		for(int i=1;i<=t;i++){
			String n = scn.nextLine();
			int diffs = 0;
			for(int j=1;j<n.length();j++){
				if(n.charAt(j)!=n.charAt(j-1))
					diffs++;
			}
			if(n.charAt(n.length()-1)=='-')
				diffs++;
			System.out.println("Case #" + i + ": "+diffs);
			
		}
		
		scn.close();

	}

}

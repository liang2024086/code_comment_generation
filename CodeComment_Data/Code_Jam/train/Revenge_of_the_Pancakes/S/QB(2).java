package methodEmbedding.Revenge_of_the_Pancakes.S.LYD567;


import java.util.Scanner;

public class QB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int n=1;n<=t;n++){
			char[] s =in.next().toCharArray();
			char stat=s[0];
			int count=0;
			for(int i=0; i<s.length; i++){
				if(s[i]==stat) continue;
				else{
					count++;
					stat=s[i];
				}
			}
			if(stat=='-') count++;
			System.out.println("Case #" + n + ": " + count);
		}

	}

}

package methodEmbedding.Speaking_in_Tongues.S.LYD1088;

import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases = Integer.parseInt(sc.nextLine());
		
		char[] l = {'y', 'h', 'e', 's', 'o', // a b c d e
				    'c', 'v', 'x', 'd', 'u', // f g h i j 
				    'i', 'g', 'l', 'b', 'k', // k l m n o
				    'r', 'z', 't', 'n', 'w', // p q r s t
				    'j', 'p', 'f', 'm', 'a', // u v w x y
				    'q'}; 					 // z
		
		for(int i = 0; i < cases; i++){
			String g = sc.nextLine();
			String s = "";
			
			for(int j = 0; j < g.length(); j++){
				if(g.charAt(j) != ' ')
					s += l[g.charAt(j) - 97];
				else 
					s += " ";
			}
			
			System.out.println("Case #" + (i + 1) +": " + s);
			
		}

	}

}

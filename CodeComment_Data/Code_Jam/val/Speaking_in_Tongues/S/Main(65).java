package methodEmbedding.Speaking_in_Tongues.S.LYD95;


import java.util.*;

public class Main {

	
	
	public static void main(String[] args) {
		char[] de_code = new char[26];

		String code = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String clair = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		for(int i = 0;i < code.length();i++){
			if(code.charAt(i) != ' '){
				de_code[code.charAt(i) - 'a'] = clair.charAt(i);
				
			}
		}
		de_code['q' - 'a'] = 'z';
		de_code['z' - 'a'] = 'q';		

		for(int i = 0;i < 26;i++){
			if(de_code[i] != '\0'){
				System.out.println("Google : " + (char)(i + 'a') + " -> " + de_code[i] + " : Clair");

			}
		}
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String L = null;
		for(int i = 0;i < N+1;i++){
			L = in.nextLine();
			char[] current = L.toCharArray();
			
			
			
			for(int j = 0;j < current.length;j++){
				
				if(current[j] != ' '){
					current[j] = de_code[current[j] - 'a'];
				}
			}
			if(i != 0){
			System.out.print("Case #" + (i) + ": ");
			for(int j = 0;j < current.length;j++){
				System.out.print(current[j]);
			}
			System.out.println();
		}
		}
		

	}

}

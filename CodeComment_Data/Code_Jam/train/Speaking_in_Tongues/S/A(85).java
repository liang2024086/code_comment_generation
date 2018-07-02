package methodEmbedding.Speaking_in_Tongues.S.LYD1113;

import java.util.*;

class A{
	public static void main(String... arg){
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		String tr = "yhesocvxduiglbkrztnwjpfmaq";
		sc.nextLine();
		for(int caseNo = 1; caseNo <= cases; caseNo++ ){
			String s = sc.nextLine();
			System.out.print("Case #" + caseNo + ": ");
			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i) != ' ')
					System.out.print(tr.charAt(s.charAt(i) - 'a'));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

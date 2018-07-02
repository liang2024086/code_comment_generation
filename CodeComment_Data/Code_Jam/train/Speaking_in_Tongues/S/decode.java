package methodEmbedding.Speaking_in_Tongues.S.LYD856;

import java.util.*;
public class decode {
	public static void main(String[] args){
		int[] code = new int[26];
		code[0] = 25;
		code[1] = 8;
		code[2] = 5;
		code[3] = 19;
		code[4] = 15;
		code[5] = 3;
		code[6] = 22;
		code[7] = 24;
		code[8] = 4;
		code[9] = 21;
		code[10] = 9;
		code[11] = 7;
		code[12] = 12;
		code[13] = 2;
		code[14] = 11;
		code[15] = 18;
		code[16] = 26;
		code[17] = 20;
		code[18] = 14;
		code[19] = 23;
		code[20] = 10;
		code[21] = 16;
		code[22] = 6;
		code[23] = 13;
		code[24] = 1;
		code[25] = 17;
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		s.nextLine();
		for(int l=0;l<T;l++){
			String lang = s.nextLine();
			int c;
			char sol[] = new char[lang.length()];
			for(int i=0;i<lang.length();i++){
				if(lang.charAt(i)>='a'&&lang.charAt(i)<='z'){
					c = lang.charAt(i) - 97;
					sol[i] = (char) (code[c]+96);
				}				
				else{
					sol[i] = lang.charAt(i);
				}
			}
			System.out.println();
			System.out.print("Case #"+(l+1)+": ");
			for(int i=0;i<lang.length();i++){
				System.out.print(sol[i]);
			}
		}
	}
}

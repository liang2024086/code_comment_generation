package methodEmbedding.Speaking_in_Tongues.S.LYD1300;

import java.util.Scanner;

public class Translator {
	public static void main(String[] args) {
		char[] letters = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u',
				'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p',
				'f', 'm', 'a', 'q' };
		int aAscii = 97;
		Scanner input = new Scanner(System.in);
		int lineCounter = Integer.parseInt(input.nextLine());
		int count = 0;
		while (count < lineCounter) {
			String line =input.nextLine();
			String newSent="";
			for(int i=0;i<line.length();i++){
				char l = line.charAt(i);
				if(l == ' '){
					newSent+=' ';
				}else{
				newSent+=letters[l%aAscii];
				}
			}
			System.out.format("Case #%d: %s\n", count+1,newSent);
			count++;
		}
	}

}

package methodEmbedding.Speaking_in_Tongues.S.LYD803;

import java.util.Scanner;

public class Google {
	public static void main(String a[]){
		Scanner in = new Scanner(System.in);
		final int T = in.nextInt();
		String[] strings = new String[T];
		char [][] chars = new char[T][];
		in.nextLine();
		for(int i = 0; i < T; i++){
			strings[i] = in.nextLine();
			chars[i] = strings[i].toCharArray();
			for(int j = 0; j < chars[i].length; j++){
				if(chars[i][j] == 'a'){
					chars[i][j] = 'y';
				}
				else if(chars[i][j] == 'b'){
					chars[i][j] = 'h';
				}
				else if(chars[i][j] == 'c'){
					chars[i][j] = 'e';
				}
				else if(chars[i][j] == 'd'){
					chars[i][j] = 's';
				}
				else if(chars[i][j] == 'e'){
					chars[i][j] = 'o';
				}
				else if(chars[i][j] == 'f'){
					chars[i][j] = 'c';
				}
				else if(chars[i][j] == 'g'){
					chars[i][j] = 'v';
				}
				else if(chars[i][j] == 'h'){
					chars[i][j] = 'x'; //pend
				}
				else if(chars[i][j] == 'i'){
					chars[i][j] = 'd';
				}
				else if(chars[i][j] == 'j'){
					chars[i][j] = 'u';
				}
				else if(chars[i][j] == 'k'){
					chars[i][j] = 'i';
				}
				else if(chars[i][j] == 'l'){
					chars[i][j] = 'g';
				}
				else if(chars[i][j] == 'm'){
					chars[i][j] = 'l';
				}
				else if(chars[i][j] == 'n'){
					chars[i][j] = 'b';
				}
				else if(chars[i][j] == 'o'){
					chars[i][j] = 'k';
				}
				else if(chars[i][j] == 'p'){
					chars[i][j] = 'r';
				}
				else if(chars[i][j] == 'q'){
					chars[i][j] = 'z';
				}
				else if(chars[i][j] == 'r'){
					chars[i][j] = 't';
				}
				else if(chars[i][j] == 's'){
					chars[i][j] = 'n';
				}
				else if(chars[i][j] == 't'){
					chars[i][j] = 'w';
				}
				else if(chars[i][j] == 'u'){
					chars[i][j] = 'j';
				}
				else if(chars[i][j] == 'v'){
					chars[i][j] = 'p';
				}
				else if(chars[i][j] == 'w'){
					chars[i][j] = 'f';
				}
				
				else if(chars[i][j] == 'x'){
					chars[i][j] = 'm';
				}
				else if(chars[i][j] == 'y'){
					chars[i][j] = 'a';
				}
				else if(chars[i][j] == 'z'){
					chars[i][j] = 'q';
				}
			}
		}
		for(int i = 0; i < T; i++){
			System.out.print("Case #"+(i+1) + ": ");
			System.out.println(chars[i]);
		}
	}
}

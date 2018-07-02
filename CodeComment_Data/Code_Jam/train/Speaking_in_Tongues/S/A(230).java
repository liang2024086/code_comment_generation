package methodEmbedding.Speaking_in_Tongues.S.LYD1549;

import java.io.*;
import java.util.*;


public class A {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		Scanner sc = new Scanner(br.readLine());
		int T = sc.nextInt();
		int caseNumber = 1;

		for(int i=0; i<T; i++){
			String G = br.readLine();
			String s = "";

			for(int j=0; j<G.length(); j++){
				char ch = G.charAt(j);
				
				if(ch=='a'){
					s += "y";
				}else if(ch == 'b'){
					s += "h";
				}else if(ch == 'c'){
					s += "e";
				}else if(ch == 'd'){
					s += "s";
				}else if(ch == 'e'){
					s += "o";
				}else if(ch == 'f'){
					s += "c";
				}else if(ch == 'g'){
					s += "v";
				}else if(ch == 'h'){
					s += "x";
				}else if(ch == 'i'){
					s += "d";
				}else if(ch == 'j'){
					s += "u";
				}else if(ch == 'k'){
					s += "i";
				}else if(ch == 'l'){
					s += "g";
				}else if(ch == 'm'){
					s += "l";
				}else if(ch == 'n'){
					s += "b";
				}else if(ch == 'o'){
					s += "k";
				}else if(ch == 'p'){
					s += "r";
				}else if(ch == 'q'){
					s += "z";
				}else if(ch == 'r'){
					s += "t";
				}else if(ch == 's'){
					s += "n";
				}else if(ch == 't'){
					s += "w";
				}else if(ch == 'u'){
					s += "j";
				}else if(ch == 'v'){
					s += "p";
				}else if(ch == 'w'){
					s += "f";
				}else if(ch == 'x'){
					s += "m";
				}else if(ch == 'y'){
					s += "a";
				}else if(ch == 'z'){
					s += "q";
				}else if(ch == ' '){
					s += " ";
				}

			}
			
			System.out.println("Case #"+caseNumber+": "+ s);
			caseNumber++;
		}
	}

	
}

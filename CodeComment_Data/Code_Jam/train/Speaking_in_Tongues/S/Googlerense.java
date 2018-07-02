package methodEmbedding.Speaking_in_Tongues.S.LYD507;

import java.util.Scanner;


public class Googlerense {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = "", t = "";
		
		int n = Integer.parseInt(scan.nextLine());
		
		for(int i=1; i<=n; i++){
			
			s = scan.nextLine();
				
			for(int j=0; j<s.length(); j++){
			
					if(s.charAt(j) == 'y') t += "a";
					if(s.charAt(j) == 'n') t += "b";
					if(s.charAt(j) == 'f') t += "c";
					if(s.charAt(j) == 'i') t += "d";
					if(s.charAt(j) == 'c') t += "e";
					if(s.charAt(j) == 'w') t += "f";
					if(s.charAt(j) == 'l') t += "g";
					if(s.charAt(j) == 'b') t += "h";
					if(s.charAt(j) == 'k') t += "i";
					if(s.charAt(j) == 'u') t += "j";
					if(s.charAt(j) == 'o') t += "k";
					if(s.charAt(j) == 'm') t += "l";
					if(s.charAt(j) == 'x') t += "m";
					if(s.charAt(j) == 's') t += "n";
					if(s.charAt(j) == 'e') t += "o";
					if(s.charAt(j) == 'v') t += "p";
					if(s.charAt(j) == 'z') t += "q";
					if(s.charAt(j) == 'p') t += "r";
					if(s.charAt(j) == 'd') t += "s";
					if(s.charAt(j) == 'r') t += "t";
					if(s.charAt(j) == 'j') t += "u";
					if(s.charAt(j) == 'g') t += "v";
					if(s.charAt(j) == 't') t += "w";
					if(s.charAt(j) == 'h') t += "x";
					if(s.charAt(j) == 'a') t += "y";
					if(s.charAt(j) == 'q') t += "z";
					if(s.charAt(j) == ' ') t += " "; 
				
			}			
			
			System.out.println("Case #" + i + ": " + t);
			t = "";
			
		}
			
		System.out.println();
	}
	
}

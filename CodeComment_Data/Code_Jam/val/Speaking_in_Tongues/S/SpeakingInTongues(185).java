package methodEmbedding.Speaking_in_Tongues.S.LYD1053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SpeakingInTongues {
	
	public static void main (String[] args){
		
		int T = 1;
		String G="";
		String S = "";
		BufferedReader reader;

        reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
			T = Integer.parseInt(reader.readLine());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StringBuffer buffer = new StringBuffer();
		for(int X=1; X<=T;X++){
			try {
				G = reader.readLine();
				char[] c = G.toCharArray();
				for(int j = 0; j<G.length();j++){
					switch(c[j]){
					case 'a' : c[j]='y'; break;
					case 'b' : c[j]='h'; break;
					case 'c' : c[j]='e'; break;
					case 'd' : c[j]='s'; break;
					case 'e' : c[j]='o'; break;
					case 'f' : c[j]='c'; break;
					case 'g' : c[j]='v'; break;
					case 'h' : c[j]='x'; break;
					case 'i' : c[j]='d'; break;
					case 'j' : c[j]='u'; break;
					case 'k' : c[j]='i'; break;
					case 'l' : c[j]='g'; break;
					case 'm' : c[j]='l'; break;
					case 'n' : c[j]='b'; break;
					case 'o' : c[j]='k'; break;
					case 'p' : c[j]='r'; break;
					case 'q' : c[j]='z'; break;
					case 'r' : c[j]='t'; break;
					case 's' : c[j]='n'; break;
					case 't' : c[j]='w'; break;
					case 'u' : c[j]='j'; break;
					case 'v' : c[j]='p'; break;
					case 'w' : c[j]='f'; break;
					case 'x' : c[j]='m'; break;
					case 'y' : c[j]='a'; break;
					case 'z' : c[j]='q'; break;
					default: break;
					}
				}
		        
		        buffer.append("Case #").append(X).append(": ").append(new String(c)).append("\r\n");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		System.out.println(buffer.toString());
	}

}

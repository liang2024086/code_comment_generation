package methodEmbedding.Speaking_in_Tongues.S.LYD1340;

import java.io.*;


public class SpeakingInTongues {
	public static void main(String[]args) throws IOException{
			
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("A-small-attempt0.out"));
		
		int num = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < num; i++){
			
			String ch;
			String s = "";
			
			
				
				ch = in.readLine();
				
				if(ch == null)
					break;
				
				for(int j = 0; j < ch.length(); j++){
					
					char c = ch.charAt(j);
					
					if(c == 'a')
						s = s.concat("y");
					else if(c == 'b')
						s = s.concat("h");
					else if(c == 'c')
						s = s.concat("e");
					else if(c == 'd')
						s = s.concat("s");
					else if(c == 'e')
						s = s.concat("o");
					else if(c == 'f')
						s = s.concat("c");
					else if(c == 'g')
						s = s.concat("v");
					else if(c == 'h')
						s = s.concat("x");
					else if(c == 'i')
						s = s.concat("d");
					else if(c == 'j')
						s = s.concat("u");
					else if(c == 'k')
						s = s.concat("i");
					else if(c == 'l')
						s = s.concat("g");
					else if(c == 'm')
						s = s.concat("l");
					else if(c == 'n')
						s = s.concat("b");
					else if(c == 'o')
						s = s.concat("k");
					else if(c == 'p')
						s = s.concat("r");
					else if(c == 'q')
						s = s.concat("z");
					else if(c == 'r')
						s = s.concat("t");
					else if(c == 's')
						s = s.concat("n");
					else if(c == 't')
						s = s.concat("w");
					else if(c == 'u')
						s = s.concat("j");
					else if(c == 'v')
						s = s.concat("p");
					else if(c == 'w')
						s = s.concat("f");
					else if(c == 'x')
						s = s.concat("m");
					else if(c == 'y')
						s = s.concat("a");
					else if(c == 'z')
						s = s.concat("q");
					else if(c == ' ')
						s = s.concat(" ");
				}
				
				out.write("Case #" + (i+1) + ": "+ s + "\n");
				

		}
	
		in.close();
		out.close();
	}
}

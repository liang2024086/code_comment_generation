package methodEmbedding.Speaking_in_Tongues.S.LYD1063;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader bu = null;
		PrintWriter pr = null;
		Integer T;
		String G;
		String S;
		
		try {
			bu = new BufferedReader(new FileReader(args[0]));
			pr = new PrintWriter(new FileWriter("out.out"));
			T = Integer.parseInt(bu.readLine());
			
			for(int i = 0; i < T; i++) {
				G = bu.readLine();
				S = "Case #" + (i + 1) + ": ";
				for(int j = 0 ; j < G.length(); j++) {
					if(G.charAt(j) == 'a')
						S += 'y';
					else if(G.charAt(j) == 'b')
						S += 'h';
					else if(G.charAt(j) == 'c')
						S += 'e';
					else if(G.charAt(j) == 'd')
						S += 's';
					else if(G.charAt(j) == 'e')
						S += 'o';
					else if(G.charAt(j) == 'f')
						S += 'c';
					else if(G.charAt(j) == 'g')
						S += 'v';
					else if(G.charAt(j) == 'h')
						S += 'x';
					else if(G.charAt(j) == 'i')
						S += 'd';
					else if(G.charAt(j) == 'j')
						S += 'u';
					else if(G.charAt(j) == 'k')
						S += 'i';
					else if(G.charAt(j) == 'l')
						S += 'g';
					else if(G.charAt(j) == 'm')
						S += 'l';
					else if(G.charAt(j) == 'n')
						S += 'b';
					else if(G.charAt(j) == 'o')
						S += 'k';
					else if(G.charAt(j) == 'p')
						S += 'r';
					else if(G.charAt(j) == 'q')
						S += 'z';
					else if(G.charAt(j) == 'r')
						S += 't';
					else if(G.charAt(j) == 's')
						S += 'n';
					else if(G.charAt(j) == 't')
						S += 'w';
					else if(G.charAt(j) == 'u')
						S += 'j';
					else if(G.charAt(j) == 'v')
						S += 'p';
					else if(G.charAt(j) == 'w')
						S += 'f';
					else if(G.charAt(j) == 'x')
						S += 'm';
					else if(G.charAt(j) == 'y')
						S += 'a';
					else if(G.charAt(j) == 'z')
						S += 'q';
					else 
						S += ' ';
				}
				pr.println(S);
			}
			pr.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			pr.close();
			bu.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

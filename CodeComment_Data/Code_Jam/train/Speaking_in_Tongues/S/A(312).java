package methodEmbedding.Speaking_in_Tongues.S.LYD133;

import java.io.*;
import java.util.*;

public class A{
	public static void main(String[] args) throws Exception{
		BufferedReader fin = new BufferedReader(new FileReader("A.txt"));
		PrintWriter fout = new PrintWriter(new FileWriter("Aout.txt"));

		String s = fin.readLine();
		int t = Integer.parseInt(s);
		s = fin.readLine();
		for(int i = 0; i < t; i++){
			
			System.out.println("what " + s);
			String l = "";
			for(int j = 0; j < s.length(); j++){
				//System.out.println(j);
				if(s.charAt(j) == ' '){
					l += " ";
				}else{
					
					switch (s.charAt(j)){
						case 'a':
							l += 'y'; break;
						case 'b':
							l += 'h'; break;
						case 'c':
							l += 'e'; break;
						case 'd':
							l += 's'; break;
						case 'e':
							l += 'o'; break;
						case 'f':
							l += 'c'; break;
						case 'g':
							l += 'v'; break;
						case 'h':
							l += 'x'; break;
						case 'i':
							l += 'd'; break;
						case 'j':
							l += 'u'; break;
						case 'k':
							l += 'i'; break;
						case 'l':
							l += 'g'; break;
						case 'm':
							l += 'l'; break;
						case 'n':
							l += 'b'; break;
						case 'o':
							l += 'k'; break;
						case 'p':
							l += 'r'; break;
						case 'q':
							l += 'z'; break;
						case 'r':
							l += 't'; break;
						case 's':
							l += 'n'; break;
						case 't':
							l += 'w'; break;
						case 'u':
							l += 'j'; break;
						case 'v':
							l += 'p'; break;
						case 'w':
							l += 'f'; break;
						case 'x':
							l += 'm'; break;
						case 'y':
							l += 'a'; break;
						case 'z':
							l += 'q'; break;
					}
				}
			}

			System.out.println(l);
			fout.println("Case #" + (i + 1) + ": " + l);
			fout.flush();
			s = fin.readLine();
		}
	}
}
		

package methodEmbedding.Speaking_in_Tongues.S.LYD384;

import java.io.*;

public class Tongues{
	
	public static void main(String args[]){
		
		try{
			
			FileInputStream fstream = new FileInputStream(args[0]);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			PrintWriter out = new PrintWriter(args[0] + "_out");
			
			String strLine = br.readLine();
			int cases = Integer.parseInt(strLine);
				
			for (int i = 0; i < cases; i++){
				
				strLine = br.readLine();
				char[] this_line = strLine.toCharArray();
				
				for (int j = 0; j < this_line.length; j++){
					
					switch (this_line[j]) {
						case 'a':  this_line[j] = 'y';
							break;
						case 'b':  this_line[j] = 'h';
							break;
						case 'c':  this_line[j] = 'e';
							break;
						case 'd':  this_line[j] = 's';
							break;
						case 'e':  this_line[j] = 'o';
							break;
						case 'f':  this_line[j] = 'c';
							break;
						case 'g':  this_line[j] = 'v';
							break;
						case 'h':  this_line[j] = 'x';
						   break;		
						case 'i':  this_line[j] = 'd';
							break;
						case 'j':  this_line[j] = 'u';
							break;
						case 'k':  this_line[j] = 'i';
							break;
						case 'l':  this_line[j] = 'g';
							break;
						case 'm':  this_line[j] = 'l';
							break;
						case 'n':  this_line[j] = 'b';
							break;
						case 'o':  this_line[j] = 'k';
							break;
						case 'p':  this_line[j] = 'r';
							break;
						case 'q':  this_line[j] = 'z';
							break;
						case 'r':  this_line[j] = 't';
							break;
						case 's':  this_line[j] = 'n';
							break;
						case 't':  this_line[j] = 'w';
						   break;		
						case 'u':  this_line[j] = 'j';
							break;
						case 'v':  this_line[j] = 'p';
							break;
						case 'w':  this_line[j] = 'f';
							break;
						case 'x':  this_line[j] = 'm';
							break;
						case 'y':  this_line[j] = 'a';
							break;
						case 'z':  this_line[j] = 'q';
							break;
					}
					
				}
				
				String new_line = new String(this_line);
				out.println("Case #" + (i+1) + ": " + new_line);
				
				}
				
			
		
			in.close();
			out.close();
			
		}
		
		catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		
	}
		
}
	

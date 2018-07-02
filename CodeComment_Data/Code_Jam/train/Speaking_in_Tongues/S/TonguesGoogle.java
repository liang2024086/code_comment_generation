package methodEmbedding.Speaking_in_Tongues.S.LYD308;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TonguesGoogle {

	/**
	 * @param args
	 */
		public static void main(String[] args) throws IOException{
		
			BufferedReader fin = new BufferedReader(new FileReader("tongues.in"));
			PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("tongues.out")));

			StringTokenizer stringy;
		
			int lines = Integer.parseInt(fin.readLine());
			for(int a=  0; a< lines; a++){
				char array[] = fin.readLine().toCharArray();				
				char[] news = new char[array.length];
				for(int x=  0; x<array.length; x++){
					news[x] = ' ';
				}
				
				for(int x = 0; x<array.length;x++){
					if(array[x] <= 'z' &&array[x]>='a'){
						if(array[x] == 'a') news[x] = 'y';
						else if(array[x] == 'b') news[x] = 'h';
						else if(array[x] == 'c') news[x] = 'e';
						else if(array[x] == 'd') news[x] = 's';
						else if(array[x] == 'e') news[x] = 'o';
						else if(array[x] == 'f') news[x] = 'c';
						else if(array[x] == 'g') news[x] = 'v';
						else if(array[x] == 'h') news[x] = 'x';
						else if(array[x] == 'i') news[x] = 'd';
						else if(array[x] == 'j') news[x] = 'u';
						else if(array[x] == 'k') news[x] = 'i';
						else if(array[x] == 'l') news[x] = 'g';
						else if(array[x] == 'm') news[x] = 'l';
						else if(array[x] == 'n') news[x] = 'b';
						else if(array[x] == 'o') news[x] = 'k';
						else if(array[x] == 'p') news[x] = 'r';
						else if(array[x] == 'q') news[x] = 'z';
						else if(array[x] == 'r') news[x] = 't';
						else if(array[x] == 's') news[x] = 'n';
						else if(array[x] == 't') news[x] = 'w';
						else if(array[x] == 'u') news[x] = 'j';
						else if(array[x] == 'v') news[x] = 'p';
						else if(array[x] == 'w') news[x] = 'f';
						else if(array[x] == 'x') news[x] = 'm';
						else if(array[x] == 'y') news[x] = 'a';
						else if(array[x] == 'z') news[x] = 'q';
						
					}
				}
				
				String asdf = new String(news);
				fout.println("Case #" + (a+1) + ": " + asdf);
				
			}
			
			fout.close();
			System.exit(0);
			
		

	}

}

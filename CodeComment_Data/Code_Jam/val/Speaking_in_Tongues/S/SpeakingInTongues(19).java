package methodEmbedding.Speaking_in_Tongues.S.LYD1101;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class SpeakingInTongues {

public static void main(String [] args) throws NumberFormatException, IOException {
			java.io.BufferedReader r = new java.io.BufferedReader(
					new java.io.FileReader(
							"C:\\Users\\AhmedMTM\\Desktop\\A-small-attempt0.in"));
			int no = Integer.parseInt(r.readLine());
			String[] results = new String[no];
			Arrays.fill(results, "");
			for (int t = 0; t < no; t++) {
				String input = r.readLine();
				for(int i=0; i<input.length(); i++) {
					switch(input.charAt(i)) {
					case 'a': results[t]+='y'; break;
					case 'b': results[t]+='h';break;
					case 'c':results[t]+='e';break;
					case 'd':results[t]+='s';break;
					case 'e':results[t]+='o';break;
					case 'f':results[t]+='c';break;
					case 'g':results[t]+='v';break;
					case 'h':results[t]+='x';break;
					case 'i':results[t]+='d';break;
					case 'j':results[t]+='u';break;
					case 'k':results[t]+='i';break;
					case 'l':results[t]+='g';break;
					case 'm':results[t]+='l';break;
					case 'n':results[t]+='b';break;
					case 'o':results[t]+='k';break;
					case 'p':results[t]+='r';break;
					case 'q':results[t]+='z';break;
					case 'r':results[t]+='t';break;
					case 's':results[t]+='n';break;
					case 't':results[t]+='w';break;
					case 'u':results[t]+='j';break;
					case 'v':results[t]+='p';break;
					case 'w':results[t]+='f';break;
					case 'x':results[t]+='m';break;
					case 'y':results[t]+='a';break;
					case 'z':results[t]+='q';break;
					case ' ':results[t]+=' ';break;
					}
				}
				
			}
			
			try {
				FileWriter outFile = new FileWriter(
						"C:\\Users\\AhmedMTM\\Desktop\\output.txt");
				PrintWriter out = new PrintWriter(outFile);
				for (int i = 0; i < results.length; i++) {
					out.println("case #"+(i+1)+": "+results[i]);
				}

				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
}

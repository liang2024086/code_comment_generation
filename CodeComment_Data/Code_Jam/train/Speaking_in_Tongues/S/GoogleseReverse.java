package methodEmbedding.Speaking_in_Tongues.S.LYD1107;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class GoogleseReverse {

	public static void main(String[] args){
		try {
			
			BufferedInputStream	bis = new BufferedInputStream(new FileInputStream(new File("/home/marcus905/Desktop/in")));
			
			Scanner sc = new Scanner(bis);
			PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File("/home/marcus905/Desktop/out"))));
			int len = Integer.parseInt(sc.next().trim());
			sc.nextLine();
			String[] results = new String[len];
			
			for(int i = 0; i < len; i++){
				String line = sc.nextLine();
				char[] linechar = line.toCharArray();
				StringBuilder sb = new StringBuilder();
				for (char c: linechar){
					char d = ' ';
					switch(c){
					case 'a': d='y';break;
					case 'b': d='h';break;
					case 'c': d='e';break;
					case 'd': d='s';break;
					case 'e': d='o';break;
					case 'f': d='c';break;
					case 'g': d='v';break;
					case 'h': d='x';break;
					case 'i': d='d';break;
					case 'j': d='u';break;
					case 'k': d='i';break;
					case 'l': d='g';break;
					case 'm': d='l';break;
					case 'n': d='b';break;
					case 'o': d='k';break;
					case 'p': d='r';break;
					case 'q': d='z';break;
					case 'r': d='t';break;
					case 's': d='n';break;
					case 't': d='w';break;
					case 'u': d='j';break;
					case 'v': d='p';break;
					case 'w': d='f';break;
					case 'x': d='m';break;
					case 'y': d='a';break;
					case 'z': d='q';break;
					}
					sb.append(d);
					}
				
				results[i] = sb.toString();
				
			}
			
			
			int k = 1;
			for(String j: results){
				pw.print("Case #"+k+": "+j+"\n");
				k++;
			}
			pw.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

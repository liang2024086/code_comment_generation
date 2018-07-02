package methodEmbedding.Speaking_in_Tongues.S.LYD1167;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A {
	public static void main(String[] args) throws IOException{
		//BufferedReader in = new BufferedReader(new FileReader(new File("C:\\Users\\braidon\\Desktop\\CodeJam\\A-large.in")));
		//FileWriter out = new FileWriter(new File("C:\\Users\\braidon\\Desktop\\CodeJam\\A-large.out"));
		BufferedReader in = new BufferedReader(new FileReader(new File("C:\\Users\\braidon\\Desktop\\CodeJam\\A-small.in")));
		FileWriter out = new FileWriter(new File("C:\\Users\\braidon\\Desktop\\CodeJam\\A-small.out"));
		
		String alfa = "abcdefghijklmnopqrstuvwxyz ";
		String google = "ynficwlbkuomxsevzpdrjgthaq ";
		
		int N = new Integer(in.readLine());
		
		for(int c = 1; c <= N; c++){
			String text = in.readLine();
			String sout = "";
			for(int cont = 0; cont < text.length(); cont++){
				sout += alfa.charAt(google.indexOf(text.charAt(cont)));
			}
			out.write("Case #" + c + ": "+ sout + "\n");
		}
		out.flush();
		out.close();
	}
}

package methodEmbedding.Speaking_in_Tongues.S.LYD449;

import java.util.*;
import java.io.*;
public class googlerese {
	
	public static void main(String[] args) throws IOException{
		char[] output = new char[26];
		output[16] = 'z';
		BufferedReader in = new BufferedReader(new FileReader("file.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("file")));
		
		for(int n=0; n<3; n++){
			String first = in.readLine();
			String next = in.readLine();
			for(int i=0; i<first.length() - 1; i++){
				char a = first.charAt(i);
				char b = next.charAt(i);
				if(a != ' ')
					output[(int) a - 97] = b;
			}
		}
		output[25] = 'q';
		in = new BufferedReader(new FileReader("file2.in"));
		int cases = Integer.parseInt(in.readLine());
		for(int n=1; n <= cases; n++){
			out.print("Case #" + n+ ": ");
			String line = in.readLine();
			for(int i=0; i<line.length(); i++){
				char c = line.charAt(i);
				int a = (int) c - 97;
				if(a >=0 && a < 26)
				out.print(output[a]);
				else out.print(c);
			}
			out.println();
		}
		//for(int n=0; n< 26; n++){
			//System.out.print(output[n] + " ");
		//}
		out.close();
		//StringTokenizer st = new StringTokenizer(in.readLine());
	}
}

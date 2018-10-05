package methodEmbedding.Speaking_in_Tongues.S.LYD712;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws Exception {
		PrintWriter out = new PrintWriter(System.out, true);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(in.readLine(),"+");
		// Scanner s = new Scanner(System.in);
		//char[] mas = {'y', 'n', 'f', 'i', 'c', 'w', 'l', 'b', 'k', 'u', 'o', 'm', 'x', 's', 'e', 'v', 'z', 'p', 'd', 'r', 'j', 'g', 't', 'h', 'a', 'q'};
		
		char[] mas = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		int n = Integer.parseInt(in.readLine());
		for(int i = 0;i < n;i++){
			String s = in.readLine();
			out.print("Case #"+(i+1)+": ");
			for(int j = 0;j < s.length();j++) {
				if(s.charAt(j) == ' ') {
					out.print(' ');
				}else{
					out.print(mas[s.charAt(j)-'a']);
				}				
			}
			out.println();
		}
	}

}

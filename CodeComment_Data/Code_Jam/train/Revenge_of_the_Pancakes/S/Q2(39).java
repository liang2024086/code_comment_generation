package methodEmbedding.Revenge_of_the_Pancakes.S.LYD31;

import java.util.*;
import java.io.*;

public class Q2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		int n = s.nextInt(),lent = n;
		while(n-->0){
			char inp[] = s.next().toCharArray();
			int len = inp.length,c = 0,a = 0;
			char l = inp[0];
			for(int j=0;j<len-1;j++){
				if(inp[j]!=inp[j+1]){
					c++;
					l = inp[j+1];
				}
			}
			if(l != '-')
				a = c;
			else
				a  = c + 1;
			out.println("Case #"+(lent-n)+": "+a);
		}
		out.close();
	}

}

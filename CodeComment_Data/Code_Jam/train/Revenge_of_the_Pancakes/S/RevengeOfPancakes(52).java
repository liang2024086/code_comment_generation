package methodEmbedding.Revenge_of_the_Pancakes.S.LYD541;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class RevengeOfPancakes {
	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader (new FileReader("B-small-attempt0.in"));
		PrintWriter out= new PrintWriter(new FileWriter("SmallB.txt"));
		int t= Integer.parseInt(bf.readLine());
		for(int c=1; c<=t; c++){
			String s= bf.readLine();
			char word[]= s.toCharArray();
			int len= word.length;
			int result=0;
			for(int i=1; i<len; i++){
				if(word[i]!=word[i-1])
					result++;
			}
			if(word[len-1]=='-')
				result++;
			out.printf("Case #%d: %d",c,result);
			
		}
		out.flush();
		out.close();

	}

}

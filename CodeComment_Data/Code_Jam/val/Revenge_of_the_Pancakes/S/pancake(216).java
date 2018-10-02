package methodEmbedding.Revenge_of_the_Pancakes.S.LYD144;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class pancake {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new FileReader("pancake.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("pancake.out")));
		int t = Integer.parseInt(buf.readLine());
		for(int i = 0; i < t; i++){
			String in = buf.readLine();
			int count = 0;
			for(int j = 0; j < in.length()-1; j++){
				if(in.charAt(j) != in.charAt(j+1)) count++;
			}
			if(in.charAt(0) == '-' && count % 2 == 0) count++;
			if(in.charAt(0) == '+' && count % 2 == 1) count++;
			out.println("Case #" + (i+1) + ": " + count);
		}
		out.close();
	}
}

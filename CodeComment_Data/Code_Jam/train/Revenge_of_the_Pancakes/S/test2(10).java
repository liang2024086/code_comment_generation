package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1118;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class test2 {
	public static void main(String args[]) {
		try (BufferedReader reader = new BufferedReader(new FileReader("test2.txt"))) {
			
		    int T = Integer.parseInt(reader.readLine());
		    int t = 1;
		    String s;
		    while ((s = reader.readLine()) != null) {
		        int flips = 0;
		        while (s.lastIndexOf('-') != -1) {
			        char c = s.charAt(0);
			        int next = 1;
			        while (next < s.length() && s.charAt(next) == c) {
			        	next++;
			        }
			        flips++;
			        StringBuilder sb = new StringBuilder();
        			sb.append(s
					.substring(0,next)
					.replace('-', 't')
					.replace('+', '-')
					.replace('t', '+')
					);
        			sb.reverse();
					sb.append(s.substring(next,s.length()));
					s = sb.toString();
		        }
		        
		        
		        System.out.println("Case #"+t+": "+flips);
		        
		        
		        t++;
		    } 
		} catch (Exception e) {
		}
		
	}
}

package methodEmbedding.Revenge_of_the_Pancakes.S.LYD678;


import java.io.BufferedReader;
import b.Node;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class B {
	

	public static void main(String[] args)
	{
		int min = 0;
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int i = 1; i <= t; ++i) {
	      String s = in.next();
	      Node n = new Node("", 0);
	      char[] chars = new char[s.length()];
	      Arrays.fill(chars, '+');
	      String goal = new String(chars);	      
	      min = n.bfs(s, goal);
	      System.out.println("Case #" + i + ": " + min);
	    }
	    in.close();
	}
	
}



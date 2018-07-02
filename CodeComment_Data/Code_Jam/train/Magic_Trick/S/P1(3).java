package methodEmbedding.Magic_Trick.S.LYD707;


import java.util.*;
import java.math.*;
import java.io.*;

public class P1 {

	public P1 () throws IOException {
		BufferedReader in = new BufferedReader (new FileReader("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter (new FileWriter("output.out"));
		int numCases = Integer.parseInt(in.readLine().trim());

		for (int cases = 1; cases <= numCases; cases++) {
			
			// First set!
			String [] arr = new String [4];
			int firstRow = Integer.parseInt(in.readLine().trim()) - 1;
			StringTokenizer st;
			
			arr [0] = in.readLine().trim();
			arr [1] = in.readLine().trim();
			arr [2] = in.readLine().trim();
			arr [3] = in.readLine().trim();
			
			st = new StringTokenizer(arr[firstRow]);

			HashSet <Integer> set = new HashSet <Integer> ();
			
			for (int i = 0; i < 4; i ++) {
				set.add(Integer.parseInt(st.nextToken()));
			}


			int secondRow = Integer.parseInt(in.readLine().trim()) - 1;
			
			arr [0] = in.readLine().trim();
			arr [1] = in.readLine().trim();
			arr [2] = in.readLine().trim();
			arr [3] = in.readLine().trim();
			
			st = new StringTokenizer(arr[secondRow]);

			boolean foundSomething = false, twice = false;

			int temp, number = -1;
			for (int i = 0; i < 4; i ++) {
				temp = Integer.parseInt(st.nextToken());
				if (foundSomething && set.contains(temp)) {
					twice = true;
				}
				else if (set.contains(temp)) {
					foundSomething = true;
					number = temp;
				}
			}

			out.print("Case #" + cases +": ");
			if (twice && foundSomething) 
				out.println("Bad magician!");
			else if (foundSomething)
				out.println(number);
			else
				out.println("Volunteer cheated!");

		}

		out.close();
		in.close();
	}


	public static void main (String [] args) throws IOException {
		new P1 ();
	}
}

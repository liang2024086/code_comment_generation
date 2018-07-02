package methodEmbedding.Speaking_in_Tongues.S.LYD1147;

import java.util.*;
import java.io.*;

public class Trans {
	public static void main(String[] args) throws IOException { 
		Scanner scan = new Scanner(new File("A-small-attempt0.in"));
		FileWriter fstream = new FileWriter("out.txt");
		BufferedWriter out = new BufferedWriter(fstream);
		int numCases = scan.nextInt();
		char arr[] = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		scan.nextLine();
		for (int z = 0; z < numCases; z++) {
			String line = scan.nextLine();
			char[] lineArr = line.toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < lineArr.length; i++) {
				if (lineArr[i] == ' ')
					sb.append(' ');
				else
					sb.append(arr[lineArr[i] - 97]);
			}
			out.write("Case #" + (z+1) + ": " + sb);
			if ( z != numCases - 1)
				out.newLine();
		}
		out.close();
	}
}

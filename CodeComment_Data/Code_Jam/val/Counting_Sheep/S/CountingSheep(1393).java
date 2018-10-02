package methodEmbedding.Counting_Sheep.S.LYD743;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CountingSheep {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader("/Users/vigneshiyer/Desktop/A-small-attempt0.in"));
		int t = Integer.parseInt(reader.readLine());
		String[] result = new String[t];
		
		for (int i = 0; i < t; i++) {
			int N = Integer.parseInt(reader.readLine());
			if (N == 0) {
				result[i] = "INSOMNIA";
				continue;
			}
			Set<Character> set = new HashSet<Character>();
			int p = 1;
			long num = N;
			while (set.size() != 10) {
				num = N*p;
				char[] arr = Long.toString(N*p).toCharArray();
				for (int j = 0; j < arr.length; j++) {
					set.add(arr[j]);
				}
				p++;
			}
			result[i] = Long.toString(num);			
		}
		FileIO.writeAllLines("/Users/vigneshiyer/Desktop/A.txt", result);
	}
}

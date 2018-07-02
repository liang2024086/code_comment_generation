package methodEmbedding.Revenge_of_the_Pancakes.S.LYD626;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = new FileInputStream("B-small-attempt0.in");
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(inputStream)));
		int first = scanner.nextInt();
		File file = new File("output.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		
		Integer flips = 0;
//		Scanner input = new Scanner(System.in);
//		String p = input.next();
		
		for(int k = 0; k < first; k++){
			String p = scanner.next();
			int size = p.length();
			ArrayList<Character> pancakes = new ArrayList<>();
			for(int i = 0; i < size; i++){
				pancakes.add(p.charAt(i));
			}
			
			for(int i = size-1; i > -1; i--) {
				if(pancakes.get(i).equals('-')){
					flips++;
					for(int j = 0; j < i+1; j++) {
						if(pancakes.get(j).equals('-')){
							pancakes.set(j, '+');
						}
						else {
							pancakes.set(j, '-');
						}
					}
				}
			}
			writer.write("Case #" + (k + 1) + ": " + flips.toString() + "\n");
			flips = 0;
		}
		writer.flush();
		writer.close();
	}
}

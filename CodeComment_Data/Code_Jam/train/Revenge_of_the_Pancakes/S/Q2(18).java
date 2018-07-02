package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1006;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("D:/ForPrograms/java/TESTS/B-small-attempt0.in"));
		FileWriter writer = new FileWriter("D:/ForPrograms/java/TESTS/B-small-attempt0.out", false);
		
		int cases = scanner.nextInt();
		
		for(int i=0;i<cases;i++){
			
			int swaps = 0;
			String s = scanner.next();
			System.out.println(s);
			
			char f = s.charAt(0);
			for(int j=1;j<s.length();j++){
				char n = s.charAt(j);
				if(f != n){
					swaps++;
					f = n;
				}
			}
			if(f == '-')
				swaps++;
			
			System.out.println(swaps);
			
			writer.write("Case #"+(i+1)+": "+swaps);
			writer.append('\r');
			writer.append('\n');
			
		}
		
		
		scanner.close();
		writer.close();
		
	}

}

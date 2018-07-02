package methodEmbedding.Counting_Sheep.S.LYD1290;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountingSheep {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("A-small-attempt1.in"))));
		FileWriter writer = new FileWriter(new File("A-small-attempt1.out"));
		
		int testCount = in.nextInt(); 
		
		for (int t = 1; t <= testCount; ++t) {
			int n = in.nextInt();
			if (n == 0) {
				writer.append("Case #" + t + ": INSOMNIA\n");
				continue;
			}
			
			int seen = 0;
			long i = 0;
			long number = 1;
			System.out.println("---------");
			System.out.println("n=" + n);
			while (seen != 1023) {
				i++;
				number = i * n;
				String asString = Long.toString(number);
				System.out.println("checking " + asString);
				for (int index=0; index<asString.length(); index++) {
					System.out.println("char=" + asString.charAt(index));
					seen = seen | (1 << (asString.charAt(index) - 48));
				}
				System.out.println("==seen=" + seen);
			}
			System.out.println("Case #" + t + ": " + number + "\n");
			writer.append("Case #" + t + ": " + number + "\n");
		}

		writer.flush();
		writer.close();
		in.close();
	}
}

package methodEmbedding.Revenge_of_the_Pancakes.S.LYD329;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc;
		try {
			sc = new Scanner(new File("in.txt"));
			PrintWriter writer = new PrintWriter("out.txt");
			
			int cases = Integer.parseInt(sc.nextLine());
			
			for(int i=1; i<=cases; ++i) {
				String line = sc.nextLine();

				int total = 0;
				boolean lastMinus = false;
				for(int j=line.length()-1;j>=0;j--) {
					if(line.charAt(j)=='-' && !lastMinus) ++total;
					lastMinus = (line.charAt(j)=='-');
				}
				
				total *= 2;
				if(lastMinus) total--;
				writer.write(String.format("Case #%d: %d\r\n", i, total));
			}
			
			writer.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}

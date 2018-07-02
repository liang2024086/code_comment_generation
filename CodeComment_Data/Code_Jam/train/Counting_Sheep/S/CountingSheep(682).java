package methodEmbedding.Counting_Sheep.S.LYD819;




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CountingSheep {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("src/data/A-small-attempt0.in"))));
		
		String output = "";
		int t = sc.nextInt();
		
		
		
		for (int i = 1; i <= t; i++) {
			
			int n = sc.nextInt();
			
			if (n == 0) {
				output += "Case #" + i + ": " + "INSOMNIA" + "\n";
				continue;
			}
			
			ArrayList<Integer> digits = new ArrayList<Integer>();
			for (int j = 0; j < 10; j++) {
				digits.add(j);
			}
			
			int p = 0;
			int num = 0;
			while (!digits.isEmpty()) {
				
				p++;
				num = n * p;	
				String s = num + "";

				for (int j = 0; j < s.length(); j++) {
					char c = s.charAt(j);
					digits.remove((Integer) Character.getNumericValue(c));					
				}						
			}

			
			output += "Case #" + i + ": " + num + "\n";
			
			
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/data/A-small-attempt0.out"), "utf-8"));
		bw.write(output);
		bw.close();
	}
}


























package methodEmbedding.Counting_Sheep.S.LYD1538;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class CountSheeps {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader(args[0])))
		{
			PrintWriter writer = new PrintWriter(args[1]);
			
			int numOfTestCases = Integer.parseInt(br.readLine());
			for (int i = 1; i <= numOfTestCases; i++) {
				Set<Integer> remaining = new HashSet<>();
				for (int j = 0; j <= 9; j++) {
					remaining.add(j);
				}
				int initial = Integer.parseInt(br.readLine());
				
				if (initial == 0) {
					writer.println("Case #" + i + ": INSOMNIA");
					continue;
				}
				
				int n = initial;
				while (!remaining.isEmpty()) {
					int a = n;
					while (a > 0) {
						int b = a % 10;
						a = a / 10;
						remaining.remove(b);
						if (remaining.isEmpty()) {
							writer.println("Case #" + i + ": " + n);
							break;
						}
					}
					n += initial;
				}
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}

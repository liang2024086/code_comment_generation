package methodEmbedding.Counting_Sheep.S.LYD237;


import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws Exception
	{
		String path = "C:\\Users\\Ziming\\Downloads\\";
		String input = path + "A-small-attempt0.in";
		String output = path + "A-small-attempt0.out";
		
		Scanner scanner = new Scanner(new FileReader(input));
		PrintWriter writer = new PrintWriter(output);
		int T = scanner.nextInt();
		for (int i=0;i<T;i++)
		{
			long N = scanner.nextLong();
			HashSet<Character> set = new HashSet<>();
			
			if (N==0)
			{
				writer.println("Case #" + (i+1) + ": INSOMNIA");
				continue;
			}

			long r = 1, x = 1;
			while (true)
			{
				r = N * x;
				String s1 = String.valueOf(r);
				for (int j=0;j<s1.length();j++)
					set.add(s1.charAt(j));
				
				if (set.size()==10)
					break;
				
				x++;
			}
			
			writer.println("Case #" + (i+1) + ": " + r);
		}
		
		writer.flush();
		writer.close();
		scanner.close();
		System.out.println("program finished :)");
	}
}

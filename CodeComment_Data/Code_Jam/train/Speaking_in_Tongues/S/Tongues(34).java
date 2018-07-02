package methodEmbedding.Speaking_in_Tongues.S.LYD757;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Tongues
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
		char[] map = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		int n = Integer.parseInt(reader.readLine());
		for (int t = 1; t <= n; t++){
			String goog = reader.readLine();
			writer.write("Case #" + t + ": ");
			for (int j = 0; j < goog.length(); j++)
			{
				char c = goog.charAt(j);
				if (c != ' ') c = map[c - 97];
				writer.write(c);
			}
			writer.write("\n");
		}
		writer.flush();
		writer.close();
		
	}

}

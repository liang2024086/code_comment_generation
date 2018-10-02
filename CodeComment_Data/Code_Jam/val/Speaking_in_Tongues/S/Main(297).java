package methodEmbedding.Speaking_in_Tongues.S.LYD303;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new FileInputStream("input.txt"));
		PrintWriter out = new PrintWriter(new FileOutputStream("output.txt"));
		
		char[] normal = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] update = {'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
		
		in.nextLine();
		int counter = 0;
		
		while (in.hasNextLine()) {
			out.write("Case #" + ++counter + ": ");
			StringTokenizer st = new StringTokenizer(in.nextLine());
			while (st.hasMoreTokens()) {
				String charString = st.nextToken();
				for (int i = 0; i<charString.length(); i++) {
					for (int j = 0; j<26; j++) {
						char character = charString.charAt(i);
						if (character == (update[j])) {
							out.write(normal[j]);
							break;
						}
					}
				}
				out.write(" ");
			}
			out.write("\n");
		}
		
		in.close();
		out.close();
	}
}

package methodEmbedding.Cookie_Clicker_Alpha.S.LYD600;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CookieClickerAlpha {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.print("Arguments required: <input> <output>");
			return;
		}
		
		Path inputPath = Paths.get(args[0]);
		Path outputPath = Paths.get(args[1]);
		Charset charset = StandardCharsets.US_ASCII;
		String s;
		try (BufferedWriter writer = Files.newBufferedWriter(outputPath, charset);
		     BufferedReader reader = Files.newBufferedReader(inputPath, charset)) {
			int tests = Integer.parseInt(reader.readLine());
			for (int test = 1; test <= tests; test++) {
				String input[] = reader.readLine().split(" ");
				double c = Double.parseDouble(input[0]);
				double f = Double.parseDouble(input[1]);
				double x = Double.parseDouble(input[2]);
				
				double rate = 2;
				double ans = x / rate;
				double base = 0;
				while (ans > base + c/rate + x/(rate + f)) {
					base = base + c/rate;
					rate = rate + f;
					ans = base + x/rate;
				}	
				
				writer.append(String.format("Case #%d: %.7f%n", test, ans));
			}
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}

	

}

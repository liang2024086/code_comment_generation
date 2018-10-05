package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1106;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileReader file = null;
		try {
			file = new FileReader("G:\\ChromeDownload\\Bsmallattempt1.in");
		}
		catch (FileNotFoundException e) {
			System.exit(1);
		}
		BufferedReader in = new BufferedReader(file);
		int tests = 0;
		try {
			tests = Integer.parseInt(in.readLine());
		}
		catch (IOException e) {
			System.exit(1);
		}
		for (int i = 0; i < tests; i++) {
			String cakes = null;
			try {
				cakes = in.readLine();
			}
			catch (IOException e) {
			
			}
			boolean isAllHappy = true;
			int count = 0;
			for (int j = 0; j < cakes.length(); j++) {
				if (cakes.charAt(j) == '-') {
					isAllHappy = false;
					break;
				}
			}
			while (!isAllHappy) {
				char first = cakes.charAt(0);
				int lastIndex = cakes.lastIndexOf("-");
				if (first == '-') {
					if (lastIndex != 0) {
						StringBuilder toBeFliped = new StringBuilder(cakes.substring(0, lastIndex + 1));
						String fliped = toBeFliped.reverse().toString();
						fliped = fliped.replaceAll("-", "0");
						fliped = fliped.replaceAll("\\+", "-");
						fliped = fliped.replaceAll("0", "\\+");
						if (lastIndex != cakes.length() - 1) {
							String anotherSubstring = cakes.substring(lastIndex + 1, cakes.length());
							StringBuilder newString = new StringBuilder(fliped + anotherSubstring);
							cakes = newString.toString();
						}
						else {
							cakes = fliped.toString();
						}
					}
					else {
						cakes = cakes.replaceFirst("-", "\\+");
					}
					count++;
					isAllHappy = true;
					for (int j = 0; j < cakes.length(); j++) {
						if (cakes.charAt(j) == '-') {
							isAllHappy = false;
							break;
						}
					}
				}
				else {
					StringBuilder minusString = new StringBuilder("-");
					int j;
					for (j = 1; j < cakes.length(); j++) {
						if (cakes.charAt(j) != '-') {
							minusString.append("-");
						}
						else {
							break;
						}
					}
					String anotherSubstring = cakes.substring(j, cakes.length());
					StringBuilder newString = new StringBuilder(minusString + anotherSubstring);
					cakes = newString.toString();
					count++;
				}
			}
			Terminal.printLine("Case #" + (i + 1) + ": " + count);
		}
	}
}

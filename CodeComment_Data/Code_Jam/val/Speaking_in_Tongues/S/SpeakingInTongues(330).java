package methodEmbedding.Speaking_in_Tongues.S.LYD410;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class SpeakingInTongues {

	public static void main(String[] args) {

		File file = new File("/Users/NoK/Desktop/A-small-attempt0.in");
		int counter = 1;

		try {
			Scanner sc = new Scanner(file);

			int numOfStrings = sc.nextInt();

			sc.nextLine();

			for (int i = 0; i < numOfStrings; i++) {
				String input = sc.nextLine();
				String[] stringArray = new String[input.length()];
				for (int j = 0; j < input.length(); j++) {
					switch (input.charAt(j)) {
					case 'a':
						stringArray[j] = "y";
						break;
					case 'b':
						stringArray[j] = "h";
						break;
					case 'c':
						stringArray[j] = "e";
						break;
					case 'd':
						stringArray[j] = "s";
						break;
					case 'e':
						stringArray[j] = "o";
						break;
					case 'f':
						stringArray[j] = "c";
						break;
					case 'g':
						stringArray[j] = "v";
						break;
					case 'h':
						stringArray[j] = "x";
						break;
					case 'i':
						stringArray[j] = "d";
						break;
					case 'j':
						stringArray[j] = "u";
						break;
					case 'k':
						stringArray[j] = "i";
						break;
					case 'l':
						stringArray[j] = "g";
						break;
					case 'm':
						stringArray[j] = "l";
						break;
					case 'n':
						stringArray[j] = "b";
						break;
					case 'o':
						stringArray[j] = "k";
						break;
					case 'p':
						stringArray[j] = "r";
						break;
					case 'q':
						stringArray[j] = "z";
						break;
					case 'r':
						stringArray[j] = "t";
						break;
					case 's':
						stringArray[j] = "n";
						break;
					case 't':
						stringArray[j] = "w";
						break;
					case 'u':
						stringArray[j] = "j";
						break;
					case 'v':
						stringArray[j] = "p";
						break;
					case 'w':
						stringArray[j] = "f";
						break;
					case 'x':
						stringArray[j] = "m";
						break;
					case 'y':
						stringArray[j] = "a";
						break;
					case 'z':
						stringArray[j] = "q";
						break;
					case ' ':
						stringArray[j] = " ";
					
					}
				}
				
				try { 
					FileWriter fw = new FileWriter("/Users/NoK/Desktop/A-small-attempt0.out", true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("Case #" + counter + ": ");
					System.out.print("Case #" + counter + ": ");
					for (int j = 0; j < input.length(); j++) {
						bw.write(stringArray[j]);
						System.out.print(stringArray[j]);
					}
					bw.newLine();
					System.out.println();
					bw.close();
					counter++;
				} catch (Exception e){
					System.err.println("Error: " + e.getMessage());
				}

			}

		} catch (FileNotFoundException e ) {
			e.printStackTrace();
		}

	}

}

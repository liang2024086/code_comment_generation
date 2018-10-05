package methodEmbedding.Speaking_in_Tongues.S.LYD1629;


import java.io.*;

public class SpeakingInTongues {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("A-small-attempt0.in");
		BufferedReader read = new BufferedReader(fr);
		FileWriter fw = new FileWriter("A-small-attempt0.out");
		BufferedWriter out = new BufferedWriter(fw);
		
		String translated = "ynficwlbkuomxsevzpdrjgthaq ";
		char[] original = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
		
		int iterations = Integer.parseInt(read.readLine());
		for(int iteration=0; iteration<iterations; iteration++){
			char[] nextLine = read.readLine().toCharArray();
			String newLine = "Case #" + (iteration+1) + ": ";
			for(int i=0; i<nextLine.length; i++){
				newLine += original[translated.indexOf(nextLine[i])];
			}
			System.out.println(newLine);
			out.write(newLine);
			out.newLine();
		}
		
		read.close();
		fr.close();
		out.close();
		fw.close();
	}
}

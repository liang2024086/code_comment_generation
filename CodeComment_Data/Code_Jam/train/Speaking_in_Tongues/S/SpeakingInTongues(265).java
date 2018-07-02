package methodEmbedding.Speaking_in_Tongues.S.LYD616;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SpeakingInTongues {

	public static final char[] translate = new char[26];
	static {
		char[] in  = "zyqeeejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv".toCharArray();
		char[] out = "qazooourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup".toCharArray();
		for (int i = 0; i < in.length; i++) {
    		int index = Character.getNumericValue(in[i]) - 10;
    		translate[index] = out[i];
    	}
	}

	/**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("2012/qualA/input.txt"));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("2012/qualA/output.txt")));

        int numberOfTests = Integer.parseInt(reader.readLine()); // T

        for (int i = 0; i < numberOfTests; i++) {
            System.out.println(i);
            char[] testCase = reader.readLine().toCharArray();
            StringBuilder sb = new StringBuilder(testCase.length);
            for (char c : testCase) {
            	if (c == ' ') {
            		sb.append(' ');
            	} else {
            		sb.append(translate[Character.getNumericValue(c) - 10]);
            	}
            }

            writer.println("Case #" + (i + 1) + ": " + sb);
        }

        writer.flush();
        writer.close();
        reader.close();
    }

}

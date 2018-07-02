package methodEmbedding.Speaking_in_Tongues.S.LYD1373;



import java.io.*;
import java.util.*;

public class ST {
	private static String fileName = ST.class.getSimpleName().replaceFirst("_.*", "");
	private static String inputFileName = "D:\\santosh\\cj12\\"+fileName + ".in";
	private static String outputFileName = "D:\\santosh\\cj12\\"+fileName + ".out";
	private static Scanner in;
	private static PrintWriter out;
	 
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		if (args.length >= 2) {
			inputFileName = args[0];
			outputFileName = args[1];
		}
		in = new Scanner(new FileReader(inputFileName));
		out = new PrintWriter(outputFileName);
		int tests = in.nextInt();
		in.nextLine();
		String code = "yhesocvxduiglbkrztnwjpfmaq";
		char letters[] = code.toCharArray();
		for (int t = 1; t <= tests; t++) {
			String str = in.nextLine();
			char output[] = str.toCharArray(); 
			//System.out.println("Input ="+str);
			for(int i=0;i<output.length;i++) {
				int offset = output[i] - 97;
				//System.out.print("Ofsset"+offset);
				if(output[i] != ' ') {
					output[i] = letters[offset];
				}
			}
			System.out.println("Case #" + t + ": "+new String(output));
			out.println("Case #" + t + ": "+new String(output));
		}
		in.close();
		out.close();
	}
}


package methodEmbedding.Standing_Ovation.S.LYD2223;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class PanCakes {
	public static boolean fileInput = true;
	public static boolean fileOut = true;
	public static String InFileName = "A-small-attempt0.in";
	public static String OutFileName = "A-small-attempt0.out";
	
	public static String outFormat = "Case #%s: %s";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br;
		try {
			if(!fileInput) {
				br = new BufferedReader(new InputStreamReader(System.in));
			} else {
				br = new BufferedReader(new FileReader(InFileName));
			}
			if(fileOut) {
				System.setOut(new PrintStream(OutFileName));
			}
			String line = br.readLine();
			int T = Integer.parseInt(line);
			for(int tc = 1;tc<=T;tc++){
				line = br.readLine();
				String[] components = line.split(" ");
				int ext_aud = 0;
				int aud = 0;
				int index = 0;
				for (char c : components[1].toCharArray()) {
					int r = c - '0';aud+=r;
					if(ext_aud + aud <= index) ext_aud = index + 1 - aud;
					index++;
				}
				System.out.println(String.format(outFormat, tc, ext_aud));
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

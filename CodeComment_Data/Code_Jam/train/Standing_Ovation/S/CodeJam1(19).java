package methodEmbedding.Standing_Ovation.S.LYD378;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class CodeJam1 {

	/**
	 * @param args
	 *            filename
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cases = 0;
		String filename = "";
		if (args.length > 0)
			filename = args[1];
		else {
			System.out.println("Please enter file path : ");
			try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        filename = br.readLine();
			} catch (Exception e) {
				System.out.println("Error !!");
			}
		}
		try {

			File fout = new File("out.txt");
			FileOutputStream fos = new FileOutputStream(fout);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			
			InputStream fis = new FileInputStream(filename);
			InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
			BufferedReader br = new BufferedReader(isr);

			cases = Integer.parseInt(br.readLine());
			
			String line = "";
			for(int i = 0; i < cases; i++) {
				line = br.readLine();
				String[] words = line.split("\\s+");
				int sMax = Integer.parseInt(words[0]);
				int standing = 0;
				int needed = 0;
				for(int j = 0; j <= sMax; j++) {
					if(standing < j)
					{
						needed += (j- standing);
						standing += (j- standing);
					}
					standing+=Character.getNumericValue(words[1].charAt(j));
					if(standing > sMax) {
						break;
					}
				}
				System.out.println("Case #" + (i + 1) + ": " + needed);
				bw.write("Case #" + (i + 1) + ": " + needed);
				bw.newLine();
			}
			bw.close();

		} catch (Exception e) {
			System.out.println("Please check file path !!!");
		}
	}
}

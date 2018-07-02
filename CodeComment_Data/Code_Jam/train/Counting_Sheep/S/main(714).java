package methodEmbedding.Counting_Sheep.S.LYD1381;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class main {
	final static String pathTiny = "tiny";
	final static String pathSmall = "A-small-attempt0";
	final static String pathLarge = "";

	final static String filesPrefix = "files\\";
	final static String inSuffix = ".in";
	final static String outSuffix = ".out";
	
	public static void main(String[] args) throws Exception {
		//String path = pathTiny;
		String path = pathSmall;
		//String path = pathLarge;

		BufferedReader br = new BufferedReader(new FileReader(filesPrefix + path + inSuffix));
		BufferedWriter bw = new BufferedWriter(new FileWriter(filesPrefix + path + outSuffix));

		String line = br.readLine();
		Integer at = 0;
		
		while ((line = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();

			at++;
			Integer N = Integer.parseInt(line);
			
			//System.out.print("Processing: ");
			//System.out.println(N);

			sb.append("Case #");
			sb.append(at);
			sb.append(": ");

			if (N == 0) {
				sb.append("INSOMNIA");
			} else {
				Boolean matched0 = false;
				Boolean matched1 = false;
				Boolean matched2 = false;
				Boolean matched3 = false;
				Boolean matched4 = false;
				Boolean matched5 = false;
				Boolean matched6 = false;
				Boolean matched7 = false;
				Boolean matched8 = false;
				Boolean matched9 = false;

				Integer itteration = 0;
				String value = null;
				while ( !matched0 || 
						!matched1 ||
						!matched2 ||
						!matched3 ||
						!matched4 ||
						!matched5 ||
						!matched6 ||
						!matched7 ||
						!matched8 ||
						!matched9) {
					itteration++;
					value = String.valueOf(itteration * N);
					for (Integer index = 0; index < value.length(); index++) {
						switch (value.charAt(index)) {
						case '0':
							matched0 = true;
							break;
						case '1':
							matched1 = true;
							break;
						case '2':
							matched2 = true;
							break;
						case '3':
							matched3 = true;
							break;
						case '4':
							matched4 = true;
							break;
						case '5':
							matched5 = true;
							break;
						case '6':
							matched6 = true;
							break;
						case '7':
							matched7 = true;
							break;
						case '8':
							matched8 = true;
							break;
						case '9':
							matched9 = true;
							break;
						}
					}
				}
				sb.append(value);
			}

			System.out.println(sb.toString());

			bw.write(sb.toString());
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}

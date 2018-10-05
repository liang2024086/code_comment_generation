package methodEmbedding.Standing_Ovation.S.LYD374;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class Problem1 {

	public static void main(String[] args) throws IOException {

		int no_testcases, smax, fr = 0, shyness[];
		File file = new File("output.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		BufferedReader br = null;
		
		try {

			String s, str[];
			str = new String[2];
			shyness = new int[7];
			FileWriter fw = new FileWriter("output.txt");
			br = new BufferedReader(new FileReader("input.in"));
			no_testcases = Integer.parseInt(br.readLine());
			for (int i = 0; i < no_testcases; i++) {
				fr = 0;
				
				s = br.readLine();
				int x = 0;
				str = s.split(" ");
				smax = Integer.parseInt(str[0]);
				int sm = smax;
				if(smax>6)
				{
					System.out.println("Case #" + (i + 1) + ": Invalid input");
					break;
				}
				for (int j = 0; j < str[1].length(); j++) {
					char[] ch = str[1].toCharArray();
					shyness[j] = Character.getNumericValue(ch[j]);					
				}

				int j = 0;
				int xold = shyness[0];
				x = shyness[0];

				while (xold <= smax) {
					if (shyness[0] == 0 && smax > 0) {
						j++;
						fr++;
						shyness[0]=1;
						xold = xold + fr;
						x = x + shyness[j] + fr;
					} 
					if (xold < j && shyness[j] != 0) {
						// x = x - shyness[j];
						fr = fr + (j - xold);
						x = x + (j - xold);
						xold = xold + (j - xold);
						// x = x + shyness[j];
					} else {
						j++;
						xold = x;
						if(j<=smax)
							x = x + shyness[j];
					}

				}

				System.out.println("Case #" + (i + 1) + ": " + fr);
				fw.write("Case #" + (i + 1) + ": " + fr + "\r\n");
				
				
				 

			} 

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}

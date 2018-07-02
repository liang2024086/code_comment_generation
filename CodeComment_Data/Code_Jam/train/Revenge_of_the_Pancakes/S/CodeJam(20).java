package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1096;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CodeJam {
	public static void main (String[] args) {

		String[] cases = null;
		try {
			File file = new File("C:/Users/rsmal/Downloads/B-small-attempt0.in");
			FileInputStream in = new FileInputStream(file);
			 
			//Construct BufferedReader from InputStreamReader
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		 
			
			String line = reader.readLine();
			
			cases = new String[Integer.parseInt(line)];
			for (int i = 0; i < cases.length; i++) {
				cases[i] = reader.readLine();
			}
		 
			reader.close();
		} catch (Exception e) {System.exit(0);}
		
		try {
			PrintWriter writer = new PrintWriter("C:/Users/rsmal/Desktop/B-small-attempt0.out", "UTF-8");
			for (int i = 0; i < cases.length; i++) {
				writer.print("Case #" + (i+1) + ": ");
				if (cases[i].indexOf("-") < 0) {
					writer.println("0");
					continue;
				} else if (cases[i].indexOf("+") < 0) {
					writer.println("1");
					continue;
				}
				
				int counter = 0;
				boolean finished = false;
				while (true) {
					int base = cases[i].lastIndexOf("-");
					
					if (base == 0) {
						writer.println(counter + 1);
						break;
					}

					System.out.println(i + "a: " + cases[i]);
					if (cases[i].indexOf('+') == 0) {
						cases[i] = cases[i].substring(0, cases[i].indexOf('-')).replace('+', '-') + cases[i].substring(cases[i].indexOf('-'));
						counter++;
					}

					System.out.println(i + "b: " + cases[i]);
					cases[i] = cases[i].substring(0, base+1).replace('-', '*').replace('+', '-').replace('*', '+') + cases[i].substring(base+1);
					counter++;
					System.out.println(i + "c: " + cases[i]);

					if (cases[i].indexOf("-") < 0) {
						writer.println(counter);
						break;
					} else if (cases[i].indexOf("+") < 0) {
						writer.println(counter + 1);
						break;
					}
				}
			}
			writer.close();
		} catch (Exception e) {System.exit(0);}
	}

}

package methodEmbedding.Counting_Sheep.S.LYD11;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CodeJam {
	public static void main (String[] args) {

		int[] cases = null;
		try {
			File file = new File("C:/Users/rsmal/Downloads/A-small-attempt1.in");
			FileInputStream in = new FileInputStream(file);
			 
			//Construct BufferedReader from InputStreamReader
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		 
			
			String line = reader.readLine();
			
			cases = new int[Integer.parseInt(line)];
			
			for (int i = 0; i < cases.length; i++) {
				cases[i] = Integer.parseInt(reader.readLine());
			}
		 
			reader.close();
		} catch (Exception e) {System.exit(0);}
		
		try {
			PrintWriter writer = new PrintWriter("C:/Users/rsmal/Desktop/A-small-attempt1.out", "UTF-8");
			boolean[] numCheck = new boolean[10];
			for (int i = 0; i < cases.length; i++) {
				for (int z = 0; z < 10; z++) numCheck[z] = false;
				
				writer.print("Case #" + (i+1) + ": ");
				if (cases[i] == 0) {
					writer.println("INSOMNIA");
					continue;
				}
				
				String currNum = "";
				int j = 1;
				while (true) {
					currNum = (cases[i] * j) + "";
					for (int k = 0; k < currNum.length(); k++) {
						numCheck[Integer.parseInt(currNum.charAt(k) + "")] = true;
					}
					boolean finished = true;
					for (int k = 0; k < 10; k++) {
						if (!numCheck[k]) {
							finished = false;
							break;
						}
					}
					if (finished) {
						writer.println(currNum);
						break;
					}
					j++;
				}
			}
			writer.close();
		} catch (Exception e) {System.exit(0);}
	}

}

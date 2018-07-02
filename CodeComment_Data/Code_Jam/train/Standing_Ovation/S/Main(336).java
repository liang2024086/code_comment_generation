package methodEmbedding.Standing_Ovation.S.LYD46;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		String path = "src/A-small-attempt2.in";
		String ans = "";
		BufferedReader br = new BufferedReader(new FileReader(path));

		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			String N = "";

			int caseIndex = 0;
			while (line != null) {

				if (caseIndex == 0) {
					N = line;
				}else{
					String[] data = line.split(" ")[1].split("(?!^)");
					
					int NumberStood = 0 ; 
					int added = 0 ; 
					for (int i =0 ; i < data.length ; i++){
						
						if ( i <= NumberStood){
							NumberStood += Integer.parseInt(data[i]);   
						}else{
							int toAdd = i - NumberStood ; 
							added += Math.abs(toAdd) ; 
							NumberStood +=Math.abs(toAdd) + Integer.parseInt(data[i]);
							
						}
						
						
					}
					ans +="Case #"+caseIndex+": "+ added+"\n" ; 
					
				}
				line = br.readLine();
				caseIndex++;

			}

			try {
				File file = new File("/Users/m/Desktop/example.txt");
				BufferedWriter output = new BufferedWriter(new FileWriter(file));
				output.write(ans);
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// String everything = sb.toString();
			// System.out.println(N);
		} finally {
			br.close();
		}

	}

}

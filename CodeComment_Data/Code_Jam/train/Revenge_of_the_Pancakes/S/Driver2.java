package methodEmbedding.Revenge_of_the_Pancakes.S.LYD932;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;


public class Driver2 {

	
	
	public static void main(String[] arg){
		BufferedReader br = null;
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("B-small-attempt0.in"));
			int line_count = Integer.parseInt(br.readLine());
			int test_case = 1;
			PrintWriter writer = new PrintWriter("out.txt", "UTF-8");
			
			
			while ((sCurrentLine = br.readLine()) != null) {
				int count = 0;
				String[] plate = (sCurrentLine + "+").split("");
				for (int i = 0; i < plate.length-1; i++){
					if (!plate[i].equals(plate[i+1]))
						count++;
					//System.out.print(plate[i]);
				}
				
				writer.println("Case #" + test_case + ": " + count);
				test_case++;
			}
			
			writer.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
}

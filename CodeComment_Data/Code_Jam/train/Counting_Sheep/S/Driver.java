package methodEmbedding.Counting_Sheep.S.LYD682;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Driver {

	
	
	
	public static void main(String[] arg){
		
		BufferedReader br = null;
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("A-small-attempt0.in"));
			int line_count = Integer.parseInt(br.readLine());
			int test_case = 0;
			PrintWriter writer = new PrintWriter("out.txt", "UTF-8");
			

			while ((sCurrentLine = br.readLine()) != null) {
//			for (int q = 0; q <= Math.pow(10, 6); q++){
//				sCurrentLine = q + "";
				int i = Integer.parseInt(sCurrentLine);
			
					boolean[] found = new boolean[10];     //check for each domainee
					
					
					int inter = 1;
					boolean found_all = false;
					String str = null;
					while ((inter < 1000000) && ( found_all == false)){
						str = (i * inter) + "";
						byte[] b = str.getBytes();     // split apart the digits in range
						for (int cnt = 0; cnt < b.length; cnt++)
							found[b[cnt]-48] = true;
						
						found_all = true;
						for (int j = 0; j < found.length; j++)
							if (found[j] == false)
								found_all = false;
						
						inter++;
						
						
					}
					if (found_all == false){
						writer.println("Case #" + (test_case+1) + ": INSOMNIA");
					}else{
						writer.println("Case #" + (test_case+1) + ": " + str);
					}
					
					
					
				test_case++;
			}
		
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}

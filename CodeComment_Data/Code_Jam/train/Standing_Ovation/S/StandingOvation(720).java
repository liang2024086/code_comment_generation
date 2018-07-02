package methodEmbedding.Standing_Ovation.S.LYD158;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation {
	
	static final String CASE = "Case #";

	public static void main(String[] args) throws Exception {
		File f = new File("StandingOvation_input.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		File outputFile = new File("StandingOvation_output.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);
		
		int tc = 1;
		String in = null;
		
		while((in = br.readLine()) != null){
			
			String[] arr = in.split(" ");
			
			int numOfShy = Integer.parseInt(arr[0]);
			String levels = arr[1];
			
			if(numOfShy+1 == levels.length() ){
			
				int ppl = 0;
				int nppl = 0;
				for(int i = 0; i<levels.length();i++){
					
					int p = Integer.parseInt(Character.toString(levels.trim().charAt(i)));
					
					if(i > ppl){
						nppl += i-nppl;
						ppl += i-nppl;
						
					}
					
					if((p == 0) && (i+1 < levels.length()) && ((i+1) > ppl) ){
						nppl += 1;
						ppl += 1;
					}
					
					ppl = ppl+p;
					
				}
				
				System.out.println(nppl);
				
				//write output
				StringBuilder output = new StringBuilder(CASE) ;
				output.append(tc).append(": ").append(nppl).append("\n");
				bw.append(output.toString());
				
				tc++;
			
			}
			
		}
		bw.flush();
		bw.close();
	}

}

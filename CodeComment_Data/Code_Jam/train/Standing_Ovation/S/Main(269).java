package methodEmbedding.Standing_Ovation.S.LYD1536;

/**
 * 11 Apr 2015, 10:15:45
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author Marco_Montalto_Monella
 *
 */
public class Main {
	
	public static int T;
	
	public static void main(String[] args) throws IOException {
		
		// first check to see if the program was run with the command line argument
	    if(args.length < 1) {
	        System.out.println("Error, usage: java ClassName inputfile");
	        System.exit(1);
	    }
	    
		Reader r = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(r);
		
		String row;
		boolean flag = true;
		int rowNumber = 1;
		
		while( (row = br.readLine()) != null ){
			
			//First row
			if(flag){
				
				//number of lines
				T = Integer.parseInt(row.trim());
				flag = false;
				continue;
			}
			
			
			StringTokenizer st = new StringTokenizer(row," ");
			int S_max = Integer.parseInt(st.nextToken().trim());
			String data = st.nextToken().trim();
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0; i<data.length(); i++){
				list.add(Integer.parseInt(""+data.charAt(i)));
			}
			
			int y=0;
			int S_0 = list.get(0);
			int claps = S_0;
			
			for(int i=1; i<list.size(); i++){
				while(claps<i){
					y++;
					claps++;
				}
				claps += list.get(i);
			}
			
			
			
			System.out.println("Case #"+(rowNumber++)+": "+y);
		}
		
		r.close();
		br.close();
	}

}

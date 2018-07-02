package methodEmbedding.Standing_Ovation.S.LYD673;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;


public class main {

	/**
	 * @param args
	 * RanexX
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("example.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while((line = in.readLine()) != null){
			for(int j=0;j<Integer.parseInt(line);j++){
				int ap=-1,ppa=0,i=0;
				String[] caseline = in.readLine().split(" ");
				int maxS = Integer.parseInt(caseline[0]);
						String per = caseline[1];
				while(i<=maxS){
					ap = ap + Character.getNumericValue(per.charAt(i));
					if(ap>=i){
						i++;
						
					}else{
						
						ap++;
						ppa++;
						
					}
					
					
				}		
				
				System.out.println("Case #" + (j +1) + ": " + ppa);
								
				}
		}
		in.close();
		
	}	
			
}

package methodEmbedding.Cookie_Clicker_Alpha.S.LYD514;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;




public class CookieClicker {
	public static void main(String args[]){
		try{
			FileInputStream file = new FileInputStream("B-small-attempt0.in");			
			DataInputStream input = new DataInputStream(file);			
			BufferedReader in = new BufferedReader(new InputStreamReader(input));
			
			String line = in.readLine();
			String[] tokens = null;
	
			int case_no = 1;
			
			while((line = in.readLine()) != null){
				tokens = line.split("\\s");
				
				double c = Double.valueOf(tokens[0]).doubleValue();
				double f = Double.valueOf(tokens[1]).doubleValue();
				double x = Double.valueOf(tokens[2]).doubleValue();
				
				double secA = x / 2;
				double secB = 0.0;
				int farm = 1;
				
				boolean go = true;
				while(go){
					secB = x/(2 + farm * f);					
					int count = 1;
					while(count <= farm){
						secB = secB + c / (2 + (count - 1) * f);
						count++;
					}
					
					if(secB < secA){
						secA = secB;
					} else {
						go = false;
					}
					farm++; 
				}
			
				System.out.printf("Case #" + case_no + ": " + "%.7f" , secA);
				System.out.println();
				
					
				case_no++;
				
				
			}
			
			input.close();
		}catch(Exception e){
			System.err.println("Error: " + e.getMessage());		
		}
	}
	
}

package methodEmbedding.Revenge_of_the_Pancakes.S.LYD480;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pancakes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		File file = new File("input2");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		int tcs = Integer.parseInt(br.readLine());
		int serial = 0;
		
		while(tcs-- > 0){
			
			serial++;
			
			String s[] = br.readLine().split("");
			
			List<String> pancakes = new ArrayList<String>(Arrays.asList(s));
			
			pancakes.remove(0);
			
			int count = 0;
			
			while(!(Collections.frequency(pancakes, "+") == pancakes.size())){
				
				if(pancakes.get(0).equals("+")){
					pancakes.set(0, "-");
					
					for(int i = 1; i < pancakes.size(); i++){
						if(pancakes.get(i).equals("-")){
							pancakes.set(i,"+");
							
							if(i + 1 < pancakes.size()){
								if(pancakes.get(i + 1).equals("+"))
									break;
							}
							
						}
						
					}
				}
				else{
					
					for(int i = 0; i < pancakes.size(); i++){
						if(pancakes.get(i).equals("-")){
							pancakes.set(i,"+");
						}
						else{
							break;
						}
						
					}
				}
				
				count++;
			}
			
			System.out.println("Case #"+serial+": "+count);
			
		}
		
	}

}

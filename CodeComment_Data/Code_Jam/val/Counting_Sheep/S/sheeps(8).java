package methodEmbedding.Counting_Sheep.S.LYD1227;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class sheeps {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		File file = new File("input2");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		int tcs = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < tcs; i++){
			
			Set<Character> cset = new HashSet<Character>();
			
			String number = br.readLine();
			
			if(number.equals("0")){
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
			
			else{
				
				int j = 1;
				
				while(true){
					
					int tempnumber = Integer.parseInt(number)*j;
					j++;
					String x = String.valueOf(tempnumber);
					
					char[] carray = x.toCharArray();
					
					
					for(char c: carray){
						cset.add(c);
					}
					
					
					if(cset.size() == 10){
						System.out.println("Case #"+(i+1)+": "+x);
						break;
					}
					
				}
				
				
				
			}
			
			
			
		}

	}

}

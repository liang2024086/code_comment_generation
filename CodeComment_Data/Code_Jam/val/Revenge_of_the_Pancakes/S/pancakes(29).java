package methodEmbedding.Revenge_of_the_Pancakes.S.LYD849;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class pancakes {

	public static void main(String[] args) {
		
		//N is the number of pancakes
		//i is the number of pancakes taken from top
		
		//Final output data
		String outputs = "";
		
		
		String[] inputsarray = new String[115];
		
		try{
			BufferedReader inputs = new BufferedReader(new FileReader("C:\\Users\\andre\\Desktop\\Code Jam\\Revenge of the Pancakes\\src\\inputs.in"));
			String inputdata = "";
			int currentData = 0;
			while((inputdata = inputs.readLine()) != null){
				if(inputdata != "" && inputdata != null){
					inputsarray[currentData] = inputdata;
					currentData++;
				}
			}
			inputs.close();
		}catch (IOException e){
			e.printStackTrace();
		}

		for(int i = 1; i < Integer.parseInt(inputsarray[0]) + 1; i++){
			String pancakes = inputsarray[i];
			HashSet<String> letters = new HashSet<String>();
			for(int letter = 0; letter < pancakes.length(); letter++){
				letters.add(String.valueOf(pancakes.charAt(letter)));
			}
			if(letters.size() == 1){
				if(letters.contains("+")){
					//Announce as 0
					outputs += "Case #" + i + ": 0\r\n";
				}else{
					//Announce as 1
					outputs += "Case #" + i + ": 1\r\n";
				}
			}else{
				ArrayList<String> letters1 = new ArrayList<String>();
				String[] splitters = new String[115];
				splitters = pancakes.split("");
				letters1.addAll(Arrays.asList(splitters));
				String startsletter = letters1.get(0);
				int switches = 1;
				while(letters1.contains("-")){
					if(letters1.get(0).equals(startsletter)){
						letters1.remove(0);
					}else if(!letters1.get(0).equals(startsletter)){
						startsletter = letters1.get(0);
						letters1.remove(0);
						switches++;
					}
				}
				outputs += "Case #" + i + ": " + switches + "\r\n";
				switches = 1;
			}
			
		}
		
		try{
			BufferedWriter output = new BufferedWriter(new FileWriter("C:\\Users\\andre\\Desktop\\Code Jam\\Revenge of the Pancakes\\src\\outputs.out"));
			output.write(outputs);
			output.close();
		}catch(IOException e){
			e.printStackTrace();
		}
			
	}
		
}


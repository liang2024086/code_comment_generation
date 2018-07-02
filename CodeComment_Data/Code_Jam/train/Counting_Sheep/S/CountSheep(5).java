package methodEmbedding.Counting_Sheep.S.LYD672;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
public class CountSheep {

	private static BufferedReader inputs;
	private static BufferedWriter outputs;

	public static void main(String[] args){
		
		//Final output data
		String output = "";
		
		//Puts all input data into array
		int[] inputsarray = new int[115];
		
		try{
			inputs = new BufferedReader(new FileReader("C:\\Users\\andre\\Desktop\\Code Jam\\Counting Sheep\\src\\inputs.in"));
			String inputdata = "";
			int currentData = 0;
			while((inputdata = inputs.readLine()) != null){
				inputsarray[currentData] = Integer.parseInt(inputdata);
				currentData++;
			}
			inputs.close();
		}catch (IOException e){
			e.printStackTrace();
		}
		
		//Starts multiplying N and i
		int i = 1;
		HashSet<Integer> foundNumbers = new HashSet<Integer>();
		int lastnumber = 0;
		for(i = 1; i < inputsarray.length; i++){
			int N = inputsarray[i];
			if(N == 0){
				//System.out.println("Case #" + i + ": INSOMNIA");
				output += "Case #" + i + ": INSOMNIA\r\n";
				foundNumbers.clear();
			}else{
				int mp = 1;
				while(foundNumbers.size() < 10){
					int A = mp * N;
					lastnumber = A;
					String tmpstring = Integer.toString(A);
					for(int place = 0; place < tmpstring.length(); place++){
							foundNumbers.add((int) tmpstring.charAt(place));
					}
					mp++;
				}
				//System.out.println("Case #" + i + ": " + lastnumber);
				output += "Case #" + i + ": " + lastnumber + "\r\n";
				mp = 0;
				foundNumbers.clear();
			}
		}
				
		try{
			outputs = new BufferedWriter(new FileWriter("C:\\Users\\andre\\Desktop\\Code Jam\\Counting Sheep\\src\\outputs.out"));
			outputs.write(output);
			outputs.close();
		}catch(IOException e){
			e.printStackTrace();;
		}
		
	}
}


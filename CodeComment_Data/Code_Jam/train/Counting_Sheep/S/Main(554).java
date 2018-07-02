package methodEmbedding.Counting_Sheep.S.LYD721;


import com.cj.counting_sheep.BleatNumber;
import com.cj.counting_sheep.CountingSheepUtils;

public class Main {

	public static void main(String args[]){

		String fileName = "/home/eit/Downloads/A-small-attempt0.in";
		
		Utils utils = new Utils();
		String[] stringArray = utils.parseInputToStringArray(fileName);
		
		BleatNumber[] bleatNumbers = CountingSheepUtils.parseData(stringArray);
		
		for (int i = 0; i < bleatNumbers.length; i++) {
			BleatNumber bleatNumber = bleatNumbers[i];
			
			String message = "Case #" + (i + 1) + ": " + bleatNumber.compute() + "\n";
			Utils.log(message);
			System.out.print(message);
			
		}
		
	}
}

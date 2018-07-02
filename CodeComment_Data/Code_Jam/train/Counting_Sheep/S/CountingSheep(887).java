package methodEmbedding.Counting_Sheep.S.LYD176;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new FileWriter("countingsheep.out"));
		int t = reader.nextInt();
		t +=1;
		
		for (int i = 1; i < t; i++) {
			long n = reader.nextLong();
			if(n == 0){
				writer.write("Case #"+(i)+": INSOMNIA");
				writer.newLine();
				//System.out.println("Case #"+(i)+": INSOMNIA");
			}else{
				boolean[] digitsFlag = {false,false,false,false,false,false,false,false,false,false};
				long itr = 1;
				Long lastNumber = null;
				while ( digitsFlag[0] == false || digitsFlag[1] == false || digitsFlag[2] == false || digitsFlag[3] == false ||
						digitsFlag[4] == false || digitsFlag[5] == false || digitsFlag[6] == false || digitsFlag[7] == false ||
						digitsFlag[8] == false || digitsFlag[9] == false) {
					lastNumber = n * itr;
					char[] numberChars = lastNumber.toString().toCharArray();
					for (int j = 0; j < numberChars.length; j++) {
						int digit = Character.getNumericValue(numberChars[j]);
						digitsFlag[digit] = true;
					}
					itr++;
		
				}
				
				writer.write("Case #"+(i)+": "+lastNumber);
				writer.newLine();
				//System.out.println("Case #"+(i)+": "+lastNumber);
			}
		}
		
		reader.close();
		writer.flush();
		writer.close();
	}

}

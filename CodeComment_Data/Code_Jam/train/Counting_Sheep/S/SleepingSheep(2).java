package methodEmbedding.Counting_Sheep.S.LYD1442;


import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SleepingSheep {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("E:\\googlecode\\A-small0.in");
		Scanner scanner = new Scanner(reader);
		
		long testcases = scanner.nextLong();
		long alltestcases = testcases;
		
		FileWriter writer = new FileWriter("E:\\googlecode\\A-small-output0.in");
		BufferedWriter buffWritter = new BufferedWriter(writer);
		
		while (testcases-- > 0) {
			Long input = scanner.nextLong();

			Long output = 0L;
			
			boolean digitView[] = {false,false,false,false,false,false,false,false,false,false};
			
			long tempInput=input;
			int rem;
			int i=0;
			
			for(int count=0;count<10 && tempInput!=0;){
				i++;
				tempInput = input*i;
				String s = String.valueOf(tempInput);
				for(int ii = 0; ii < s.length(); ii++)
				{
				 char ch = s.charAt(ii);
				 if(digitView[Character.getNumericValue(ch)]==false){
					 digitView[Character.getNumericValue(ch)]=true;
					 count ++;
				 }
					 
				}
			}
			output = input*i;

			// code for writing into output file
			if (output > 0) {
				buffWritter.write("Case #" + (alltestcases - testcases)
						+ ": " + output);
				buffWritter.newLine();
				System.out.println("Case #" + (alltestcases - testcases) + ": "
						+ output);
			} else {
				buffWritter.write("Case #" + (alltestcases - testcases)
						+ ": INSOMNIA");
				buffWritter.newLine();
				System.out.println("Case #" + (alltestcases - testcases)
						+ ": INSOMNIA");
			}

		}
		
		scanner.close();
		buffWritter.close();
		reader.close();
		writer.close();
	}
	
}

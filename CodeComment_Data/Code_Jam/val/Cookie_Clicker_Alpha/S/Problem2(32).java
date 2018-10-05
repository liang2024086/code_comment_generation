package methodEmbedding.Cookie_Clicker_Alpha.S.LYD333;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Problem2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader input1 = new FileReader("B-small-attempt0.in");
		FileWriter output = new FileWriter("output.txt");
		
		BufferedReader reader1 = new BufferedReader(input1);
		BufferedWriter writer = new BufferedWriter(output);
		
		String line1 = reader1.readLine();
		//System.out.println(line1);
		int total = Integer.valueOf(line1);
		
		for(int i=0; i<total; i++)
		{
			line1 = reader1.readLine();
			//System.out.println(line1);
			String data[] = line1.split(" ");
			double farmPrice = Double.valueOf(data[0]);
			double farmRate = Double.valueOf(data[1]);
			double target = Double.valueOf(data[2]);
			double currentRate = 2.0;
			boolean completed = false;
			double timeTillNow = 0.0;
			
			while(!completed)
			{
				double withOutBuying = target/currentRate + timeTillNow;
				double afterBuying = (farmPrice/currentRate) + (target/(currentRate+farmRate)) + timeTillNow;
				
				//System.out.println(withOutBuying + " - " + afterBuying);
				
				//System.out.println(withOutBuying + " - " + afterBuying);
				if(withOutBuying>afterBuying)
				{
					timeTillNow += farmPrice/currentRate;
					currentRate+= farmRate;
				}
				else
				{
					completed = true;
					writer.write("Case #" + (i+1) + ": ");
					writer.write(String.valueOf(withOutBuying));
					writer.newLine();
				}
			}
		}
		
		reader1.close();
		writer.close();
		
	}

}

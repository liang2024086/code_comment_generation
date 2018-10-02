package methodEmbedding.Counting_Sheep.S.LYD685;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if(args.length<=0)
			throw new RuntimeException("Filepath is not given");
		String fullFilepath = args[0];
		
		BufferedReader reader = new BufferedReader(new FileReader(new File(fullFilepath)));
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output_CountingSheep.txt")));

		int T;
		Long N;
		T = Integer.parseInt( reader.readLine());
		int counter =1;
		
		while(T>0){
			T--;
			N = Long.parseLong( reader.readLine());
			
			boolean[] seen = new boolean[10];
			
			for(int i=0; i<seen.length; i++){
				seen[i] = false;
			}
			
			if(N==0){
				writer.write("Case #" + counter +": " + "INSOMNIA");
				writer.newLine();
				counter++;
				
			}
			else {
				int mulFactor = 1;
				boolean notCompleted = true;
				Long temp;
				
				while(true){
					temp = N * mulFactor;
					while(temp >0){
						seen[(int) (temp%10)] = true;
						temp /= 10;
					}
					
					notCompleted =false;
					for(int i=0; i<seen.length; i++){
						if(!seen[i]){
							notCompleted =true;
							break;
						}
					}
					if(notCompleted){
						mulFactor++;
					}else {
						break;
					}
				}
				
				temp = N * mulFactor;
				
				writer.write("Case #" + counter +": " + temp);
				writer.newLine();
				counter++;
				
			}
		} //All test cases completed
		
		writer.close();
		reader.close();
		
	}

}

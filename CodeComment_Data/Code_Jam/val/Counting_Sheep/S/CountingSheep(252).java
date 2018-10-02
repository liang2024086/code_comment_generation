package methodEmbedding.Counting_Sheep.S.LYD103;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class CountingSheep {

	public static void main(String[] args) {
		
		try {
			File input = new File("A-small-attempt1.in");
			File output = new File("output.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(output));
			Scanner sc = new Scanner(input);
			
			int testcases = sc.nextInt();
			for(int i = 1; i <= testcases; i++){
				long N = sc.nextLong();
				sc.nextLine();
				boolean[] arr = new boolean[10];
				
				if(N == 0){
					//System.out.println("INSOMNIA");
					writer.write("Case #" + i + ": " + "INSOMNIA\n");
				} else {
					
					int mul = 0;
					int cnt = 0;
					
					while(cnt < 10){
						mul++;
						long val = mul * N;
						
						while(val > 0 && cnt < 10){
							int dig = (int)(val % 10);
							val /= 10;
							if(!arr[dig]){
								cnt++;
								arr[dig] = true;
							}
						}
						
					}
					//System.out.println(mul*N);
					writer.write("Case #" + i + ": " + mul*N + "\n");
				}
			}
			writer.close();
		} catch(Exception ex){
			
		}

	}

}

package methodEmbedding.Counting_Sheep.S.LYD1415;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Sheep {

	public static void main(String args[]){
		try{
			Scanner in = new Scanner(new FileReader("A-small-attempt0.in"));
			BufferedWriter output = new BufferedWriter(new FileWriter(new File("output.txt")));
			int cases = in.nextInt();
			int q = 0;
			for (int i = 0; i < cases; i++){
				q++;
				long n = in.nextLong();
				long nn = n;
				output.write("Case #"+ q + ": ");
				if (n == 0)
					output.write("INSOMNIA\n");
				else{
					boolean [] valuesSeen = new boolean[10];
					int sum = 0;
					while (sum < 10){
						long temp = n;
						while (temp != 0){
							int temp1 = (int)temp % 10;
							if (!valuesSeen[temp1]){
								valuesSeen[temp1] = true;
								sum++;
								if (sum == 10){
									output.write(n + "\n");
									temp = 0;
									sum = 11;
								}
							}
							temp/= 10;
						}
						n += nn;
					}
				}
				
				
			}
				in.close();
				output.flush();
				output.close();
				
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}

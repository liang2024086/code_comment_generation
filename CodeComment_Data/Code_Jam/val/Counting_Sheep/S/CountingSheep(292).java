package methodEmbedding.Counting_Sheep.S.LYD876;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CountingSheep {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = (new BufferedReader(new FileReader("A-small-attempt1.in.txt")));
		int argumentCount = Integer.parseInt(in.readLine());
		int[] key = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] found = new int[10];
		Arrays.fill(found, -1);
		Integer number = 0;
		Integer tmpNumber = 0;
		int digitCount = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		
		
		while(i < argumentCount) {
			number = Integer.parseInt(in.readLine());
			tmpNumber = number;
			k = 0;
			if(number == 0) {
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
			}
			else {
				while(!Arrays.equals(found, key)) {
					j = 0;
					digitCount = (int)(Math.log10(tmpNumber) + 1);
					while(j < digitCount) {
						if(found[tmpNumber % 10] != key[tmpNumber % 10])
							found[tmpNumber % 10] = tmpNumber % 10;
						
						j++;
						tmpNumber /= 10;
					}
					if(k > 10000) {
						System.out.println("Case #" + (i + 1) + ": INSOMNIA");
						break;
					}
						
					k++;
					tmpNumber = number * k;
				}
				System.out.println("Case #" + (i + 1) + ": " + ((k - 1)) * number);
			}
			i++;
			Arrays.fill(found, -1);
		}
		
		in.close();
	}

}

package methodEmbedding.Counting_Sheep.S.LYD144;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("D:/ForPrograms/java/TESTS/A-small-attempt0.in"));
		FileWriter writer = new FileWriter("D:/ForPrograms/java/TESTS/A-small-attempt0.out", false);
		
		int cases = scanner.nextInt();
		
		int[] arr = new int[10];
		
		for(int i=0;i<cases;i++){
			int done = 0;
			for(int g=0;g<arr.length;g++){
				arr[g] = 0;
			}
			
			long n = scanner.nextInt();
			int j=0;
			
			if(n == 0){
				System.out.println();
				writer.write("Case #"+(i+1)+": "+"INSOMNIA");
				writer.append('\r');
				writer.append('\n');
				
				continue;
			}
			
			 //nn = n;
			//N*j
			long nn;
			do{		
				
				j++;
				nn = n*j;
				//long nn = n;
				do{
					int d = (int) (nn%10);
					nn = (int) Math.ceil(nn/10);
					if(arr[d] == 0){
						arr[d] = 1;
						done++;
					}
					//GET DIGITS
				}while(nn>0);
				
				
				
			}while(done<10);
			
			writer.write("Case #"+(i+1)+": "+(n*j));
			writer.append('\r');
			writer.append('\n');
			//System.out.println();
			
		}
		
		scanner.close();
		writer.close();
		
	}

}

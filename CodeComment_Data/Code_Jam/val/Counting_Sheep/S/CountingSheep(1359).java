package methodEmbedding.Counting_Sheep.S.LYD1068;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountingSheep {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\ukssp\\programs\\CountingSheep\\src\\file.in"));
		
		int amount = Integer.parseInt(read.readLine());
		
		for(int i = 1; i <= amount; i++){
			int n = Integer.parseInt(read.readLine());
			//System.out.println(n);
			if(n == 0){
				System.out.println("Case #" + i+": INSOMNIA");
				continue;
			}
			
			int[] digits = new int[10];
			
			for(int mult = 1; mult > 0; mult++){
				int num = mult*n;
				int ans = num;
				
				while (num > 0) {
				    digits[num % 10] += 1;
				    num = num / 10;
				}
				
				boolean all = true;
				for(int amt : digits){
					if(amt < 1) all = false;
				}
				if(all){
					System.out.println("Case #" + i+": " + ans);
					break;
				}
			}
		}
	}
}

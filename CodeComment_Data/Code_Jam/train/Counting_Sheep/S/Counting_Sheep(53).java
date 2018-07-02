package methodEmbedding.Counting_Sheep.S.LYD1114;

import java.util.*;
import java.io.*;
	
public class Counting_Sheep {
		
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("A-small-attempt2.in"));
		int t = in.nextInt();
		int[] numbers = new int[t];
		for (int i = 0; i < t; i++){
			numbers[i] = in.nextInt();
		}
		for (int i = 0; i < t; i++){
			int[] check = new int[10];
			int x = numbers[i];
			int j = 1;
			int count = 0;
			boolean insomnia = true;
			while (count < 100){
				check[(int)(x%Math.pow(10, j)/Math.pow(10, j-1))] = 1;
				if (x%Math.pow(10, j) == x){
					boolean all = true;
					for (int k = 0; k < 10; k++){
						if (check[k] == 0){
							all = false;
							break;
						}
					}
					if (all == true){
						System.out.println("Case #" + (i+1) + ": " + x);
						insomnia = false;
						break;
					}
					j = 1;
					x = (count+2)*numbers[i];
					count++;
				}else{
					j++;
				}
			}if (insomnia == true){
				System.out.println("Case #" + (i+ 1) + ": " + "INSOMNIA");
			}
		}
		
	}
}

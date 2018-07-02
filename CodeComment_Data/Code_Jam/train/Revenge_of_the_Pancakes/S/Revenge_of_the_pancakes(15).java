package methodEmbedding.Revenge_of_the_Pancakes.S.LYD30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Revenge_of_the_pancakes {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("B-small-attempt1.in"));
		int t = in.nextInt();
		String[] numbers = new String[t];
		in.nextLine();
		for (int i = 0; i < t; i++){
			numbers[i] = in.nextLine();
		}
		for (int i = 0; i < t; i++){
			int count = 0;
			char[] plus = new char[numbers[i].length()];
			for(int j = 0; j < numbers[i].length(); j++){
				plus[j] = numbers[i].charAt(j);
			}
			if(numbers[i].length() == 1){
				if(plus[0] == '+'){
					System.out.println("Case #" + (i+1) + ": " + count);
				}else{
					System.out.println("Case #" + (i+1) + ": " + (count+1));
				}
			}
			char a = plus[0];
			char b;
			for(int x = 1; x < numbers[i].length(); x++){
				b = plus[x];
				if (a!=b){
					count++;
					for(int k = 0; k < x; k++){
						plus[k] = b;
					}
					a = b;
				}if(x == numbers[i].length()-1){
					if(b == '+'){
						System.out.println("Case #" + (i+1) + ": " + count);
					}else{
					System.out.println("Case #" + (i+1) + ": " + (count+1));
					}
				}
			}
				
		}
		
	}
}

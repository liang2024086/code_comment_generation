package methodEmbedding.Counting_Sheep.S.LYD197;

import java.util.Scanner;
import java.util.*;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int T = sc.nextInt();
		List<Integer> inputs = new ArrayList<>();
		List<Integer> used = new ArrayList<>();
		for(int i = 0;i<T;i++){
			inputs.add(sc.nextInt());
		}
		sc.close();
		int i = 1;
		boolean counting = true;
		for(int input:inputs){
			int j = 1;
			while(counting){
				int number2 = input*j;
				int number = number2;
				if(number == 0){
					System.out.println("Case #"+i+ ": INSOMNIA");
					break;
				}
				while (number > 0) {
					int digit = number % 10;
					if(!used.contains(digit)){
						used.add(digit);
					}
				    number = number / 10;
				    
				}
				j++;
				if(used.size()==10){
					System.out.println("Case #"+i+": "+number2);
					
					used.clear();
					break;
				}
			}
			i++;
		}
	}

}

package methodEmbedding.Counting_Sheep.S.LYD688;

import java.util.*;

public class Code {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int tC = in.nextInt();
		
		for(int z = 0; z < tC; z++) {
			int number = in.nextInt();
			if(number == 0){
				System.out.println("Case #" + (z+1) + ": INSOMNIA");
				continue;
			}
			boolean[] nums = new boolean[10];
			for(int i = 0; i < 10; i++){
				nums[i] = false;
			}

			for(int i = 1; i < 100; i++){
				int temp = number*i;
				boolean numFound = false;
				while(temp > 0){
					nums[temp % 10] = true;
					temp /= 10;

					boolean found = true;
					for(int j = 0; j < 10; j++){
						if(nums[j] == false){
							found = false;
							break;
						}
					}
					if(found){
						numFound = true;
						System.out.println("Case #" + (z+1) + ": "+number*i);
						break;
					}

				}
				if(numFound)
					break;
			}
			

		}
	}

}

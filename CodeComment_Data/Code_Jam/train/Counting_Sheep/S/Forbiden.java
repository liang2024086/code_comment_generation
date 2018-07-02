package methodEmbedding.Counting_Sheep.S.LYD63;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Forbiden {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(input.hasNext()) {
			int T = input.nextInt();
			for (int i =1; i<T+1;i++){
				int N =input.nextInt();
				int[] digits= {1,1,1,1,4,5,6,7,8,1};
				int result = 0;
				int countI = 1;
				int testN = N;
				if (N == 0) {
					System.out.println("Case #"+i+": INSOMNIA");
					continue;
				}
				boolean flag = true;
				while(flag){
					while(testN!=0)
					{ 
						result = testN%10;
						digits[result]=0;
						testN/=10; 
					}
					int sum=0;
					for (int j=0;j<digits.length; j++){
						sum+=digits[j];
					}
					if (sum==0) break;
					countI++;
					testN = N*countI;
				}
				System.out.println("Case #"+i+": "+N*countI);
			}
		}
	}

}

package methodEmbedding.Counting_Sheep.S.LYD308;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Insomania {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numTests = sc.nextInt();



		for(int i = 0; i <= numTests;i++){

			long n = sc.nextLong();

			Map<Character,Boolean> is = new HashMap<>();

			for(int j = 1; j <= 1000000;j++){

				long nn = j*n;

				String sn = String.valueOf(nn);

				for(int k = 0;k < sn.length();k++){

					is.put(sn.charAt(k), true);


				}

				if(is.size() == 10){
					System.out.println("Case #"+(i+1)+": "+nn);
					break;
				}

			}

			if(is.size() != 10){
				System.out.println("Case #"+i+": Insomania");
			}


		}

	}

}

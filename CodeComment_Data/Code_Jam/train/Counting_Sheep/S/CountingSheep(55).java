package methodEmbedding.Counting_Sheep.S.LYD202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(
	            new InputStreamReader(System.in));

		int testCases = Integer.parseInt(in.readLine());
		
		for(int j=0; j<testCases; j++) {
			int input = Integer.parseInt(in.readLine());
			
			if(input == 0) {
				System.out.println("Case #"+(j+1)+": INSOMNIA");
				continue;
			}
			
			int copyValue = input;
			int loopCount = 1;
			Set<Integer> count = new HashSet<>();
			boolean insomnia = false;
			
			while (true) {
				String value = String.valueOf(input);
				for (int i=0; i < value.length(); i++) {
					char a = value.charAt(i);
					int digit = Integer.parseInt(a+"");
					count.add(digit);
				}
				if (count.size() == 10) {
					break;
				}
				
				loopCount += 1;
				if(loopCount == Integer.MAX_VALUE) {
					insomnia = true;
					break;
				}
				input = copyValue*loopCount;
			}
			
			if(insomnia) {
				System.out.println("Case #"+(j+1)+": INSOMNIA");
			}else {
				System.out.println("Case #"+(j+1)+": "+input);
			}
			
		}
		
	}

}

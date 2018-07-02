package methodEmbedding.Counting_Sheep.S.LYD147;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		long n, input, multiplyWith, result;
		String line;

		line = bufferedReader.readLine();
		n = Long.parseLong(line);
		
		for(int counter = 1; counter <= n; counter++){
			input = Long.parseLong(bufferedReader.readLine());
			if (input == 0) {
				System.out.println("Case #" + counter + ": " + "INSOMNIA");
			}else{
				boolean done = false;
				boolean digits[] = new boolean[10];
				multiplyWith = 0;

				for (int i = 0; i < 10; i++) {
					digits[i] = false;
				}
				while (!done) {
					multiplyWith++;
					result = input * multiplyWith;
					long thisResult = result;
					while (thisResult > 0) {
						int digit = (int) (thisResult % 10);
						digits[digit] = true;
						thisResult = thisResult / 10;
					}
					done = true;
					for (int i = 0; i < 10; i++) {
						if (!digits[i]) {
							done = false;
							break;
						}
					}
				}

				System.out.println("Case #" + counter + ": " + (input * multiplyWith));	
			}
		}
	}

}

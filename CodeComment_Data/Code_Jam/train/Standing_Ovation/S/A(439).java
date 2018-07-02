package methodEmbedding.Standing_Ovation.S.LYD1560;

import java.util.Scanner;



public class A{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		int test_cases = Integer.parseInt(line);

		for(int i = 0; i < test_cases; i++){
			int invited = 0;
			int current = 0;
			int threshold = 0;
			int max_required;

			line = in.nextLine();
			String data[] = line.split(" ");
			max_required = Integer.parseInt(data[0]);
			String participants = data[1];

			for(int j = 0; j <= max_required || current == max_required; j++){
				int count = (int) participants.charAt(j) - '0';
				if(count != 0){
					if(current < threshold){
						invited += threshold - current;
						current = threshold;
					} 
					current += count;
				}
				threshold++;
			}

			System.out.println("Case #" + (i + 1) + ": " + invited);
		}
	}
}

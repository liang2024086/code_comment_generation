package methodEmbedding.Counting_Sheep.S.LYD909;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import file_handler.FH;

public class CountingSheep {

	public static void main(String[] args) {

		String filename = "A-small-attempt0";
		BufferedReader br = FH.read(filename + ".in");
		StringBuilder sb = new StringBuilder();
		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> complete = new HashSet<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		boolean end = false;
		int sheepNum = 0;
		int nextLine = 0;
		int newNum = 0;
		int counter = 0;


		int numOfRounds;
		try {
			numOfRounds = Integer.parseInt(br.readLine().trim());


			for (int i = 0; i < numOfRounds; i++) {

				nextLine = Integer.parseInt(br.readLine().trim());
				newNum = nextLine;
				end = false;
				counter = 0;
				
				a.clear();

				if(nextLine == 0){
					sb.append("Case #" + (i + 1) + ": Insomnia\n");
					continue;
				}
				
				while(!end){
					for (int j = newNum; j > 0; j/=10) {
						a.add(j%10);
					}
					if (a.containsAll(complete)){
						sheepNum = newNum;
						end = true;
					}
					newNum = nextLine * (counter+1);

					counter++;
				}
				
				sb.append("Case #" + (i + 1) + ": " + sheepNum + "\n");
			}
			sb.setLength(sb.length() - 1);
			br.close();
			FH.write(filename+".out", sb);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package methodEmbedding.Speaking_in_Tongues.S.LYD1459;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class SpeakingInTongues {


	private static int[] differenceValues = {24, 6, 2, 15, 10, 
									-3, 15, 16, -5, 11, 
									-2, -5, -1, -12, -4, 
									2, 9, 2, -5, 3, 
									-11, -6, -17, -11, -24, 
									-9};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> s = new ArrayList<String>();
		
		System.out.println("Input");
		
		int num = Integer.valueOf(br.readLine()).intValue();
		
		if (num < 1 && num > 30) {
			System.out.println("Input value should be larger than 0, also smaller than 31.");
			return ;
		} 
		
		StringBuilder buffer = new StringBuilder();
		
		int i = 0;
		while (i < num) {
			buffer.append(br.readLine().toLowerCase());

			char temp;
			for (int j = 0; j < buffer.length() && j < 100; j++) {
				temp = buffer.charAt(j);
				if (temp < 97 || temp > 122) {
					continue;
				}
				buffer.setCharAt(j, (char) (temp + differenceValues[temp - 97]));
			}
			
			s.add(buffer.toString());
			buffer.setLength(0);
			i++;
		}
		
		System.out.println("Ouput");
		
		for (i = 1; i <= s.size(); i++) {
			System.out.print("Case #" + String.valueOf(i) + ": ");
			System.out.println(s.get(i-1));
		}

	}
	
}

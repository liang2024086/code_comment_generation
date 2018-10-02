package methodEmbedding.Standing_Ovation.S.LYD455;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Sangmin Lee
 * Google Code Jam Qualification Round 2015
 * 4/10/2015
 * Standing Ovation
 */

public class StandingOvation {
	public static void main(String args[]) {
		ArrayList<Integer> audience = new ArrayList<Integer>();
		
		//Reading
		File afile = new File("A-small-attempt2.in");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(afile));
			int iterations = Integer.parseInt(reader.readLine());//number of lines/
			for (int cnt = 1; cnt <= iterations; cnt++){
				audience = new ArrayList<Integer>();
				//for each of the lines after the first one
				String line = reader.readLine();
				//System.out.println(line);
				int num_of_audience = Integer.parseInt(line.split(" ")[0]) + 1;
				//System.out.println(":".concat(Integer.toString(num_of_audience)));
				String audience_string = line.split(" ")[1];
				for (int i = 0; i < num_of_audience; i++){
					audience.add(Integer.parseInt(Character.toString(audience_string.charAt(i))));
				}
				int num_of_people = 0;
				int answer = 0;
				//System.out.println(audience.toString());
				for (int j = 0; j < num_of_audience; j++){
					if (audience.get(j) != 0){
						if (j <= num_of_people){
							num_of_people += audience.get(j);
						}
						else{
							answer += j - num_of_people;
							num_of_people = j + audience.get(j);
						}
					}
				}
				System.out.println("Case #".concat(Integer.toString(cnt)).concat(": ").concat(Integer.toString(answer)));
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		//Reading end
	}
}
